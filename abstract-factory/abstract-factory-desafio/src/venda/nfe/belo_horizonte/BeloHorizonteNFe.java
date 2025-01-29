package venda.nfe.belo_horizonte;

import venda.nfe.NFe;

public class BeloHorizonteNFe implements NFe {

    @Override
    public void gerar() {
        System.out.println("Gerando NF-e com imposto de Belo Horizonte.");
    }
}
