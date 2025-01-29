package com.joseppamancio.model;

public class Contato {
    private Integer codigo;
    private String nome;
    private String telefone;

    // Construtor, getters e setters
    public Contato(Integer codigo, String nome, String telefone) {
        this.codigo = codigo;
        this.nome = nome;
        this.telefone = telefone;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }
}
