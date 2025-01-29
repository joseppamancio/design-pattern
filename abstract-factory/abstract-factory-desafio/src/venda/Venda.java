package venda;

import venda.boleto.Boleto;
import venda.factory.ModuloVendaFactory;
import venda.nfe.NFe;

public class Venda {
    private final NFe notaFiscal;
    private final Boleto boleto;

    public Venda(ModuloVendaFactory moduloVendaFactory){
        this.notaFiscal = moduloVendaFactory.criarNFe();
        this.boleto = moduloVendaFactory.criarBoleto();
    }

    public void realizar() {
        notaFiscal.gerar();
        boleto.emitir();
    }
}
