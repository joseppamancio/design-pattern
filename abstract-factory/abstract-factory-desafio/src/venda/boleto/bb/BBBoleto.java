package venda.boleto.bb;

import venda.boleto.Boleto;

public class BBBoleto implements Boleto {

    @Override
    public void emitir() {
        System.out.println("Emitindo Boleta do Banco do Brasil.");
    }
}
