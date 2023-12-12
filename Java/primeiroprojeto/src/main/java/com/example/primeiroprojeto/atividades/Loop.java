package com.example.primeiroprojeto.atividades;

import java.util.Scanner;

public class Loop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double mediaAvaliacao =0;
        int nota =0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite a nota de avaliação do filme: ");
             nota = input.nextInt();
            mediaAvaliacao += nota;
        }

        System.out.println("Média de 3 avaliações: " + mediaAvaliacao/3);
    }
}
