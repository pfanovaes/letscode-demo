package br.com.letscode.letscodedemo.servlet;

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
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        String nome = req.getParameter("nome");
        String sobrenome = req.getParameter("sobrenome");
        String idade = req.getParameter("idade");
        String data = req.getParameter("data");

        //Usuario user = new Usuario(nome, sobrenome, idade, data)

       ServletResponse resp = null;
       resp.setContentType("text/html");
       PrintWriter writer = resp.getWriter();
       writer.println("página de cadastro acessada");
       writer.println("<ul>");
       writer.println("<li>nome: " + nome + "</li");
       writer.println("<li>sobrenome: " + sobrenome + "</li");
       writer.println("<li>idade: " + idade + "</li");
       writer.println("<li>data: " + data + "</li");


   }

}
