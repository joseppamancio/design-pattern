package com.joseppamancio.factory_method;


import com.joseppamancio.factory_method._3_abstraction.Logger;
import com.joseppamancio.factory_method._4_creation.ConsoleLogCreator;
import com.joseppamancio.factory_method._5_use.CalculadoraDeImpostos;

public class FactoryMethodApplication {

	public static void main(String[] args) {

        Logger consoleLogger = new ConsoleLogCreator();
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos(consoleLogger);

        calculadora.calcular(1000.00);

    }
}
