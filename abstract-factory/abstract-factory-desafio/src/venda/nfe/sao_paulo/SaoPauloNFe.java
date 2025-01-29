package venda.nfe.sao_paulo;

import venda.nfe.NFe;

public class SaoPauloNFe implements NFe {

    @Override
    public void gerar() {
        System.out.println("Gerando NF-e com imposto de São Paulo.");
    }
}
