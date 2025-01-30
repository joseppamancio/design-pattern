package com.joseppamancio.seguradora;

public enum TipoCalculadoraEnum {

    CARRO {
        @Override
        public CalculadoraPremioSeguro obterCalculadoraSeguro() {
            return new CalculadoraPremioSeguroParaCarro();
        }
    },
    MOTO {
        @Override
        public CalculadoraPremioSeguro obterCalculadoraSeguro() {
            return new CalculadoraPremioSeguroParaMoto();
        }
    };

    public abstract CalculadoraPremioSeguro obterCalculadoraSeguro();
}
