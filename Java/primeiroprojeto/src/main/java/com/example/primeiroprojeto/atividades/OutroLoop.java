package com.example.primeiroprojeto.atividades;

import java.util.Scanner;

public class OutroLoop {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double mediaAvaliacao =0;
        int nota =0;
        int totalAvaliacoes=0;

        while (nota != -1) {
            System.out.println("Digite a nota de avaliação do filme ou -1 pra sair: ");
            nota = input.nextInt();

            if (nota != -1) {
                mediaAvaliacao += nota;
                totalAvaliacoes++;
            }
        }

        System.out.println("Média de avaliações: " + mediaAvaliacao/totalAvaliacoes);
    }
}
