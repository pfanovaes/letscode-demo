package br.com.letscode.letscodedemo.modelo.acao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CadastrarPessoasForm {

    public String executar() {
        return "WEB-INF/view/formulario.html";
    }
}
