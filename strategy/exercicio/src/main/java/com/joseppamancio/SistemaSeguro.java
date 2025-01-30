package com.joseppamancio;

import com.joseppamancio.seguradora.*;

import java.util.Scanner;

public class SistemaSeguro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        Cliente cliente = new Cliente(nome, idade);
        PropostaSeguro proposta = new PropostaSeguro(cliente);

        while (true) {
            System.out.print("Digite o tipo do veículo CARRO(1) ou MOTO(2) ou SAIR(0) para encerrar: ");
            int opcaoSeguro = scanner.nextInt();

            if (opcaoSeguro == 0)
                break;

            System.out.print("Digite o valor do veículo: ");
            double valorVeiculo = scanner.nextDouble();

            TipoCalculadoraEnum calculadorSeguro = TipoCalculadoraEnum.values()[opcaoSeguro - 1];
            proposta.setCalculadora(calculadorSeguro.obterCalculadoraSeguro());
            System.out.println(proposta.gerar(valorVeiculo));
        }
        scanner.close();
    }
}
