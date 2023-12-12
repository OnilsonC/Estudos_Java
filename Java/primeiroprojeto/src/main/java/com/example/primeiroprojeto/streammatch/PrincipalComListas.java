package com.example.primeiroprojeto.streammatch;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filmes filme1 = new Filmes("Interestelar", 2014);
        filme1.avalia(8);
        Filmes filme2 = new Filmes("A Fuga", 2006);
        filme2.avalia(9);
        Filmes filme3 = new Filmes("O Senhor dos anéis: O retorno do rei", 2003);
        filme3.avalia(10);
        Series serie1 = new Series("Supernatural", 2005);
        serie1.avalia(8);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filme1);
        lista.add(filme2);
        lista.add(filme3);
        lista.add(serie1);

        for (Titulo item: lista) {
            System.out.println("Assistidos: " + item);
            if (item instanceof Filmes) {
                Filmes filmes = (Filmes) item;
                System.out.println("Item avaliado " + filmes.getSomaAvaliacoes());
           }
        }

          //for usando lambda
//        lista.forEach(item -> System.out.println(item));

        List<String> listaNome = new LinkedList<>();
        listaNome.add("Helena");
        listaNome.add("Antônio");
        listaNome.add("Wanessa");

        System.out.println(listaNome);

        Collections.sort(listaNome);
        System.out.println("Lista ordenada: "+ listaNome);

        System.out.println("Lista ordenada da programação:");
        Collections.sort(lista);
        System.out.println(lista);

        System.out.println("Listar por ano de lançamento");
        lista.sort(Comparator.comparing(Titulo::getAnoLancamento));
        System.out.println(lista);
    }
}
