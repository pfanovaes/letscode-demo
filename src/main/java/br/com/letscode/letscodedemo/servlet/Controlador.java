package br.com.letscode.letscodedemo.servlet;

import br.com.letscode.letscodedemo.dao.BancoDeDados;
import br.com.letscode.letscodedemo.modelo.Pessoa;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/controlador")
public class Controlador extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String acao = req.getParameter("acao");

        if (acao.equals("cadastrar-pessoas")) {
            String nome = req.getParameter("nome");
            String sobrenome = req.getParameter("sobrenome");
            String idade = req.getParameter("idade");
            String data = req.getParameter("data");

            Pessoa pessoa = new Pessoa(nome, sobrenome, idade, data);
            // chama método responsável
            cadastro(pessoa);
            resp.sendRedirect("/app/controlador?acao=listar-pessoas");
        } else if (acao.equals("listar-pessoas")) {
            listar(req, resp);
        } else if (acao.equals("remover-pessoas")) {
            String id = req.getParameter("id");
            remover(id);
        } else if (acao.equals("alterar-pessoas")) {
            //implementar
        } else if (acao.equals("criar-pessoas-form")) {
            req.getRequestDispatcher("WEB-INF/formulario.html").forward(req, resp);
        }
    }

    public void cadastro(Pessoa pessoa) {

        BancoDeDados bd = new BancoDeDados();
        bd.salvar(pessoa);
    }

    public void listar(HttpServletRequest req, HttpServletResponse resp) {
        BancoDeDados bd = new BancoDeDados();
        List<Pessoa> pessoas = bd.listar();
        req.setAttribute("pessoas", pessoas );
        req.setAttribute("titulo", "Página de listagem de pessoas");

        try {
            req.getRequestDispatcher("WEB-INF/lista-pessoas.jsp").forward(req, resp);
        } catch (IOException | ServletException e) {
            e.printStackTrace();
        }
    }

    public void remover(String id){
        //implementar remover
    }
}
