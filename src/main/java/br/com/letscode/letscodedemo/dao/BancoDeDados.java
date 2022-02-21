package br.com.letscode.letscodedemo.dao;

import br.com.letscode.letscodedemo.modelo.Pessoa;

import java.util.List;
import java.util.ArrayList;

public class BancoDeDados {

    private static List<Pessoa> pessoas = new ArrayList<>();

    public void salvar(Pessoa pessoa) {
        BancoDeDados.pessoas.add(pessoa);
    }

    public List<Pessoa> listar() {
        return BancoDeDados.pessoas;
    }
}
