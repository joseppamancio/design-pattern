package com.joseppamancio.seguradora;

public class CalculadoraPremioSeguroParaMoto implements CalculadoraPremioSeguro {
    public double calcular(Cliente cliente, double valorVeiculo) {
        return valorVeiculo * 0.05 + (cliente.idade < 25 ? 150 : 75);
    }
}
