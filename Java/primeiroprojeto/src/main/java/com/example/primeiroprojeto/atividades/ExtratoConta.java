package com.example.primeiroprojeto.atividades;

import java.util.Scanner;

public class ExtratoConta {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double saldo = 3200.55;
        double deposito = 0;
        double saque = 0;
        int opcao = 0;
        String correntista = "Onilson Cardoso";
        String conta = "Correntista";

        System.out.println("Extrato de conta");
        System.out.println("\nContribuinte: " + correntista);
        System.out.println("Tipo de conta: " + conta);
        System.out.println("Saldo da conta: R$ " + saldo);

        while (opcao != 4){
            System.out.println("\nOperações:");
            System.out.println("1 - Receber valor");
            System.out.println("2 - Transferir valor");
            System.out.println("3 - Consultar saldos");
            System.out.println("4 - Sair");

            System.out.println("\nDigite a opção desejada: ");
            opcao = input.nextInt();

            if(opcao == 1) {
                System.out.println("Digite o valor que deseja depositar: ");
                deposito = input.nextDouble();
                if(deposito <= 0)
                    System.out.println("Valor incorreto.");
                else
                 saldo += deposito;
                 System.out.println("Saldo total: R$ " + saldo);
            }

            else if(opcao == 2) {
                System.out.println("Digite o valor que deseja sacar: ");
                saque = input.nextDouble();
                if(saque > saldo)
                    System.out.println("Não há saldo suficiente para realizar essa transferência.");
                else
                    saldo -= saque;
                    System.out.println("Saldo total: R$ " + saldo);
            }

            else if(opcao == 3) {
                System.out.println("Seu saldo atual é de: R$ "+ saldo);
            }
            else if (opcao != 4) {
                System.out.println("opção inválida.");
            }
        }
    }
}
