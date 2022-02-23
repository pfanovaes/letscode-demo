package br.com.letscode.letscodedemo.modelo.acao;

import br.com.letscode.letscodedemo.dao.BancoDeDados;
import br.com.letscode.letscodedemo.modelo.Pessoa;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ListarPessoas {

    private final HttpServletRequest req;
    private final HttpServletResponse resp;

    public ListarPessoas(HttpServletRequest req, HttpServletResponse resp) {
        this.req = req;
        this.resp = resp;
    }

    public String executar() {
        BancoDeDados bd = new BancoDeDados();
        List<Pessoa> pessoas = bd.listar();
        req.setAttribute("pessoas", pessoas );
        req.setAttribute("titulo", "Página de listagem de pessoas");

        return "WEB-INF/view/lista-pessoas.jsp");
    }
}
