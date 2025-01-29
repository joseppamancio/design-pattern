package com.algaworks.repository.xml;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

import com.algaworks.model.PedidoVenda;
import com.algaworks.repository.PedidosVendas;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.security.AnyTypePermission;

public class XMLPedidosVendasRepository implements PedidosVendas {

	@Override
    public void salvar(PedidoVenda pedidoVenda) {
		XStream xstream = new XStream();
		xstream.addPermission(AnyTypePermission.ANY);
	    xstream.alias("pedido-venda", PedidoVenda.class);
	    OutputStream out = null;
        try {
	        out = new FileOutputStream(pedidoVenda.getDescricao() + ".xml");
	        xstream.toXML(pedidoVenda, out);
        } catch (FileNotFoundException e) {
	        throw new RuntimeException("Erro salvando arquivo", e);
        }
    }

}
