package com.joseppamancio.dependency_injection.desafio;

import com.joseppamancio.dependency_injection.desafio.bean.FilmeService;
import com.joseppamancio.dependency_injection.desafio.bean.impl.FilmeServiceImpl;
import com.joseppamancio.dependency_injection.desafio.repository.xml.XMLFilmeRepository;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        FilmeService service = new FilmeServiceImpl(new XMLFilmeRepository());

        String nome = JOptionPane.showInputDialog("Digite o nome do filme:");
        String dataLancamento = JOptionPane.showInputDialog("Digite a data de lançamento (dd/MM/yyyy):");

        service.cadastrarFilme(nome, dataLancamento);

    }
}
