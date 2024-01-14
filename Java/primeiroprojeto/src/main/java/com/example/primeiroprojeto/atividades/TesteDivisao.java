package com.example.primeiroprojeto.atividades;

import java.util.Scanner;

public class TesteDivisao {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        Divisao divisaoNumb1 = new Divisao();

        try {
        System.out.println("Digite o dividendo");
        divisaoNumb1.setDividendo(input.nextDouble());

        System.out.println("Digite o divisor");
        divisaoNumb1.setDivisor(input.nextDouble());

        double resultado = divisaoNumb1.divisao();
        System.out.println("Resultado da divisão foi: " + resultado);

        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
