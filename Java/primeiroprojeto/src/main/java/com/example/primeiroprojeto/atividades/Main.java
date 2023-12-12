package com.example.primeiroprojeto.atividades;

public class Main {

    public static void main(String... args) {
        System.out.println("Esse é o Scream Match");
        System.out.println("Filme: Senhor dos Anéis: O retorno do Rei");

        int anoLancamento = 2022;

        boolean clientePremium = false;

        double mediaFilme = (9.2 + 8.2 + 6.8) / 3;

        System.out.println("Ano de lançamento: " + anoLancamento);

        System.out.println("Média do filme: " + mediaFilme);

        int classificacao;
        classificacao = (int) (mediaFilme / 2);

        System.out.println("estrelas: "+ classificacao);

        int celsius = 32;
        double fahrenheit = (celsius * 1.8) + 32;

        System.out.println(fahrenheit);
    }
}
