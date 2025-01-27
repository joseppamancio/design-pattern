package com.joseppamancio.factory_method._5_use;

import com.joseppamancio.factory_method._3_abstraction.Logger;

public class CalculadoraDeImpostos {

    private Logger logger;

    public CalculadoraDeImpostos(Logger logger) {
        this.logger = logger;
    }

    public void calcular(double valor) {
        // Aqui teria a lógica de cálculo de impostos

        // Exemplo de log do valor calculado
        logger.log("Imposto calculado para o valor R$" + valor);
    }
}