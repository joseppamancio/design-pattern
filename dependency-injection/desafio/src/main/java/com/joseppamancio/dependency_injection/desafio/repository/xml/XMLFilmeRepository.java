package com.joseppamancio.dependency_injection.desafio.repository.xml;

import com.joseppamancio.dependency_injection.desafio.model.Filme;
import com.joseppamancio.dependency_injection.desafio.repository.FilmeRepository;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.security.AnyTypePermission;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class XMLFilmeRepository implements FilmeRepository {

    @Override
    public void salvar(Filme filme) {
        XStream xstream = new XStream();
        xstream.addPermission(AnyTypePermission.ANY);
        xstream.alias("filme", Filme.class);
        OutputStream out = null;
        try {
            out = new FileOutputStream(filme.getNome() + ".xml");
            xstream.toXML(filme, out);
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Erro salvando arquivo", e);
        }
    }
}