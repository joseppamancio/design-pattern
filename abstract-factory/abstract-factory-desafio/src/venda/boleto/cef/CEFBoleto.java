package venda.boleto.cef;

import venda.boleto.Boleto;

public class CEFBoleto implements Boleto {

    @Override
    public void emitir() {
        System.out.println("Emitindo Boleta da Caixa Econômica Federal.");
    }
}
