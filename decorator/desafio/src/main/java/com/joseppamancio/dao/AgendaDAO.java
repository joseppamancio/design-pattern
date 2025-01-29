package com.joseppamancio.dao;

import com.joseppamancio.model.Contato;

public interface AgendaDAO {
    void inserir(Contato contato);
    Contato buscar(int codigo);
}