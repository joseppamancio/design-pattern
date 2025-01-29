package com.joseppamancio.dao;

import com.joseppamancio.model.Contato;

import java.util.HashMap;
import java.util.Map;

public class CacheAgendaDAO implements AgendaDAO {
    private AgendaDAO agendaDAO;
    private Map<Integer, Contato> cache = new HashMap<>();

    public CacheAgendaDAO(AgendaDAO agendaDAO) {
        this.agendaDAO = agendaDAO;
    }

    @Override
    public void inserir(Contato contato) {
        agendaDAO.inserir(contato);
        cache.put(contato.getCodigo(), contato);
    }

    @Override
    public Contato buscar(int codigo) {
        if (cache.containsKey(codigo)) {
            return cache.get(codigo);
        } else {
            Contato contato = agendaDAO.buscar(codigo);
            if (contato != null) {
                cache.put(codigo, contato);
            }
            return contato;
        }
    }
}