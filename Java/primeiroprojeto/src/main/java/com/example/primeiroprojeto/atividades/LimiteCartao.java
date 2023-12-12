package com.example.primeiroprojeto.atividades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LimiteCartao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double limite = 0;
        double compra = 0;
        int opcao = 1;
        String detalheCompra="";

        List<Double> listarValores = new ArrayList<>();
        listarValores.add(compra);



        System.out.println("Digite o limite do cartão: ");
        limite = input.nextDouble();

            while (opcao != 0) {

                System.out.println("Digite a descrição do produto: ");
                String descricao = input.next();

                System.out.println("Digite o valor da compra: ");
                compra = input.nextDouble();
                if (limite >= compra) {
                    for (double quantCompras : listarValores) {
                        compra += quantCompras;
                        limite -= compra;
                        detalheCompra = descricao;
                    }

                    System.out.println("Compra realizada!");
                }else{
                    System.out.println("Saldo insuficiente!");
                    System.out.println();
                    System.out.println("Compras realizadas");
                    Collections.sort(listarValores);
                    System.out.println();
                    System.out.println(compra + detalheCompra);
                    System.out.println();
                    System.out.println("Saldo R$ "+ limite);
                }
                System.out.println("Digite 0 para sair ou 1 para continuar");
                opcao = input.nextInt();
        }
    }
}
