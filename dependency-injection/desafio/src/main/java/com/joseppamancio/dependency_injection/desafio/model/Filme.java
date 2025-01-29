package com.joseppamancio.dependency_injection.desafio.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Filme {
    private String nome;
    private LocalDate dataLancamento;
    private String tipo;

    public Filme(String nome, LocalDate dataLancamento) {
        this.nome = nome;
        this.dataLancamento = dataLancamento;
        this.tipo = determinarTipo(dataLancamento);
    }

    private String determinarTipo(LocalDate dataLancamento) {
        return ChronoUnit.MONTHS.between(dataLancamento, LocalDate.now()) > 3 ? "Antigo" : "Novo";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}