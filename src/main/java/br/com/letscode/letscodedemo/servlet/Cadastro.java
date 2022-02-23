package br.com.letscode.letscodedemo.servlet;

import br.com.letscode.letscodedemo.dao.BancoDeDados;
import br.com.letscode.letscodedemo.modelo.Pessoa;

import java.io.PrintWriter;
import java.io.IOException;
import java.util.List;


import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "cadastro", value= "/cadastro")
public class Cadastro extends HttpServlet {

   @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        String nome = req.getParameter("nome");
        String sobrenome = req.getParameter("sobrenome");
        String idade = req.getParameter("idade");
        String data = req.getParameter("data");

       Pessoa pessoaModelo = new Pessoa(nome, sobrenome, idade, data);

       BancoDeDados bd = new BancoDeDados();
       bd.salvar(pessoaModelo);

       //Usuario user = new Usuario(nome, sobrenome, idade, data)



       List<Pessoa> pessoas = bd.listar();
       req.setAttribute("pessoas", pessoas );
       req.setAttribute("titulo", "Página de listagem de pessoas");
       req.getRequestDispatcher("WEB-INF/lista-pessoas.jsp").forward(req, resp);

   }

}
