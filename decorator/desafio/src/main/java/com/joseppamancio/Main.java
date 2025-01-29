package com.joseppamancio;

import com.joseppamancio.dao.AgendaDAO;
import com.joseppamancio.dao.AgendaDAOImpl;
import com.joseppamancio.dao.CacheAgendaDAO;
import com.joseppamancio.model.Contato;

public class Main {
    public static void main(String[] args) {
        AgendaDAO cacheAgendaDAO = new CacheAgendaDAO(new AgendaDAOImpl());

        Contato contato1 = new Contato(1, "João", "123456789");
        Contato contato2 = new Contato(2, "Maria", "987654321");

        cacheAgendaDAO.inserir(contato1);
        cacheAgendaDAO.inserir(contato2);

        Contato contatoEncontrado = cacheAgendaDAO.buscar(1);
        System.out.println(contatoEncontrado.getNome());

        contatoEncontrado = cacheAgendaDAO.buscar(2);
        System.out.println(contatoEncontrado.getNome());
    }
}