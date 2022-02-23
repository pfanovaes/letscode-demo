package br.com.letscode.letscodedemo.servlet;

import br.com.letscode.letscodedemo.dao.BancoDeDados;
import br.com.letscode.letscodedemo.modelo.Pessoa;
import br.com.letscode.letscodedemo.modelo.acao.CadastrarPessoas;
import br.com.letscode.letscodedemo.modelo.acao.CadastrarPessoasForm;
import br.com.letscode.letscodedemo.modelo.acao.ListarPessoas;

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
        String path = null;

        if (acao.equals("cadastrar-pessoas")) {

            CadastrarPessoas cadastrarPessoas = new CadastrarPessoas(req, resp);
            cadastrarPessoas.executar();

            resp.sendRedirect("/app/controlador?acao=listar-pessoas");

        } else if (acao.equals("listar-pessoas")) {

            ListarPessoas listarPessoas = new ListarPessoas(req, resp);
            path = listarPessoas.executar();
            req.getRequestDispatcher(path).forward(req, resp);
        } else if (acao.equals("remover-pessoas")) {
            //implementar
        } else if (acao.equals("alterar-pessoas")) {
            //implementar
        } else if (acao.equals("cadastrar-pessoas-form")) {
            CadastrarPessoasForm form = new CadastrarPessoasForm();
            path = form.executar();
        }

        req.getRequestDispatcher(path).forward(req, resp);
    }

    public void cadastro(Pessoa pessoa) {

        BancoDeDados bd = new BancoDeDados();
        bd.salvar(pessoa);
    }




}
