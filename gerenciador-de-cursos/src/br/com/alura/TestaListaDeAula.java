package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {
    public static void main(String[] args) {

        Aula a1 = new Aula("Spring Boot", 21);
        Aula a2 = new Aula("JPA Hibernate", 35);
        Aula a3 = new Aula("Tratamento de exceções", 25);

        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);
        System.out.println(aulas);

        Collections.sort(aulas);
        System.out.println(aulas);

        Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
        System.out.println(aulas);

        //outra alternativa para chamar o método sort
        aulas.sort(Comparator.comparing(Aula::getTempo));
    }
}
