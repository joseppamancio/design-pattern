package venda.factory;

import venda.boleto.Boleto;
import venda.nfe.NFe;

import java.util.Properties;

public class LojaFactory implements ModuloVendaFactory{

    private Properties prop;

    public LojaFactory() {
        try {
            prop = new Properties();
            prop.load(this.getClass().getResourceAsStream("/config/config.properties"));        } catch (Exception e) {
            throw new RuntimeException("Erro ao carregar arquivo de configuração.", e);
        }
    }

    @Override
    public NFe criarNFe() {
        try {
            String classeNFe = prop.getProperty("venda.nfe");
            return (NFe) Class.forName(classeNFe).getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao criar instância de venda.nfe.NFe.", e);
        }
    }

    @Override
    public Boleto criarBoleto() {
        try {
            String classeBoleto = prop.getProperty("venda.boleto");
            return (Boleto) Class.forName(classeBoleto).getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao criar instância de venda.boleto.Boleto.", e);
        }
    }
}
