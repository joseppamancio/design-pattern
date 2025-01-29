package com.joseppamancio.dao;

import com.joseppamancio.model.Contato;

import java.util.HashMap;
import java.util.Map;

public class AgendaDAOImpl implements AgendaDAO {
    private Map<Integer, Contato> contatos = new HashMap<>();

    @Override
    public void inserir(Contato contato) {
        contatos.put(contato.getCodigo(), contato);
    }

    @Override
    public Contato buscar(int codigo) {
        return contatos.get(codigo);
    }
}