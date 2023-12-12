package com.example.primeiroprojeto.atividades;

import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random numberRandom = new Random();
        int totalTentativas=0;

        System.out.println("Lançando número aleatório...");
        int numeroSorteado = numberRandom.nextInt(100);
        System.out.println(numeroSorteado);

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite sua tentativa");
            int tentativa = input.nextInt();
            totalTentativas += tentativa;

            if (tentativa < numeroSorteado){
                System.out.println("O número sorteado é maior");
            }
            else if (tentativa > numeroSorteado) {
                System.out.println("O número sorteado é menor");
            }

            if (tentativa == numeroSorteado) {
                System.out.println("Acertou a numeração: " + numeroSorteado);
                break;
            }
        }
        System.out.println("Acabou as chances");
        System.out.println("numero sorteado: " + numeroSorteado);
    }
}
