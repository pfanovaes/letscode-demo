package br.com.letscode.letscodedemo.modelo.acao;

import br.com.letscode.letscodedemo.dao.BancoDeDados;
import br.com.letscode.letscodedemo.modelo.Pessoa;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class CadastrarPessoas {

    private final HttpServletRequest req;
    private final HttpServletResponse resp;

    public CadastrarPessoas(HttpServletRequest req, HttpServletResponse resp) {
        this.req = req;
        this.resp = resp;
    }

    public String executar() {

        String nome = req.getParameter("nome");
        String sobrenome = req.getParameter("sobrenome");
        String idade = req.getParameter("idade");
        String data = req.getParameter("data");

        Pessoa pessoa = new Pessoa(nome, sobrenome, idade, data);

        BancoDeDados bd = new BancoDeDados();
        bd.salvar(pessoa);

        return "redirect:/app/controlador?acao=listar-pessoas";
    }

}