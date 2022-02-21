package br.com.letscode.letscodedemo.modelo;



public class Pessoa {
    private String nome;
    private String sobrenome;
    private String idade;
    private String data;

    public Pessoa(String nome, String sobrenome, String idade, String data) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.data = data;
    }

    public String getNome() {
        return this.nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public String getIdade() {
        return this.idade;
    }

    public String getData() {
        return this.data;
    }

}
