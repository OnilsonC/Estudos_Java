package com.example.primeiroprojeto.streammatch;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Filmes filme1 = new Filmes("O Senhor dos anéis: A sociedade do anél", 2001);
        //filme1.setAvaliacaoFilme(9);

        Filmes filme2 = new Filmes("O Senhor dos anéis: As duas torres", 2002);
        //filme2.setAnoFilme(2002);
        //filme2.setAvaliacaoFilme(8);

        Filmes filme3 = new Filmes("O Senhor dos anéis: O retorno do rei", 2003);
        //filme3.setNomeFilme();
        //filme3.setAvaliacaoFilme(10);

        //Series serie1 = new Series("Supernatural", 2004);

        ArrayList<Filmes> listaFilmes = new ArrayList<>();
        listaFilmes.add(filme1);
        listaFilmes.add(filme2);
        listaFilmes.add(filme3);

        System.out.println("Tamanho da lista: " + listaFilmes.size());
        System.out.println("Primeiro filme: " + listaFilmes.get(0).getNome());
        System.out.println("toString filme: " + listaFilmes);

    }
}
