package com.joseppamancio.dependency_injection.desafio.bean.impl;

import com.joseppamancio.dependency_injection.desafio.bean.FilmeService;
import com.joseppamancio.dependency_injection.desafio.model.Filme;
import com.joseppamancio.dependency_injection.desafio.repository.xml.XMLFilmeRepository;

import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FilmeServiceImpl implements FilmeService {

    private XMLFilmeRepository xmlFilmeRepository;

    public FilmeServiceImpl(XMLFilmeRepository xmlFilmeRepository){
        this.xmlFilmeRepository = xmlFilmeRepository;
    }

    @Override
    public void cadastrarFilme(String nome, String dataLancamentoStr) {
        LocalDate dataLancamento = LocalDate.parse(dataLancamentoStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        Filme filme = new Filme(nome, dataLancamento);
        xmlFilmeRepository.salvar(filme);
        JOptionPane.showMessageDialog(null, "Filme cadastrado com sucesso!");
    }
}
