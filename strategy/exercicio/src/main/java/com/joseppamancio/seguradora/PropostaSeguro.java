package com.joseppamancio.seguradora;

public class PropostaSeguro {
    private final Cliente cliente;
    private CalculadoraPremioSeguro calculadora;

    public PropostaSeguro(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setCalculadora(CalculadoraPremioSeguro calculadora) {
        this.calculadora = calculadora;
    }

    public String gerar(double valorVeiculo) {
        if (calculadora == null) {
            return "Calculadora de prêmio não definida.";
        }
        double premio = calculadora.calcular(cliente, valorVeiculo);
        return "Proposta de seguro para " + cliente.nome + ": R$ " + premio;
    }
}
