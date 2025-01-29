package venda.factory;

import venda.boleto.Boleto;
import venda.nfe.NFe;

public interface ModuloVendaFactory {
    NFe criarNFe();
    Boleto criarBoleto();
}
