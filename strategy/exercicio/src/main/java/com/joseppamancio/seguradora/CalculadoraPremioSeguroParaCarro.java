package com.joseppamancio.seguradora;

public class CalculadoraPremioSeguroParaCarro implements CalculadoraPremioSeguro {
    public double calcular(Cliente cliente, double valorVeiculo) {
        return valorVeiculo * 0.02 + (cliente.idade < 25 ? 100 : 50);
    }
}
