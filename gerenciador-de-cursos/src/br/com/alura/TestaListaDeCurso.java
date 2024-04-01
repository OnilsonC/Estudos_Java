package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaListaDeCurso {
    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Trabalhando com coleções", "Paulo Silveira");

        List<Aula> aulas = javaColecoes.getAulas();
        System.out.println(aulas);

//        aulas.add(new Aula("Spring Boot", 21));
//        System.out.println(aulas);

//        javaColecoes.getAulas().add(new Aula("Novo Curso Java", 25));

        javaColecoes.adiciona(new Aula("Novo Curso Java", 25));
        javaColecoes.adiciona(new Aula("Spring Boot", 21));
        javaColecoes.adiciona(new Aula("Certificacao Java SE 8 Programmer I", 28));
        //System.out.println(javaColecoes.getAulas());

        List<Aula> aulasImutaveis = javaColecoes.getAulas();
        System.out.println(aulasImutaveis);

        List<Aula> aulaList = new ArrayList<>(aulasImutaveis);

        Collections.sort(aulaList);
        System.out.println(aulaList);

        System.out.println(aulas == javaColecoes.getAulas());

        System.out.println(javaColecoes);

        System.out.println(javaColecoes.somaTempo());

    }
}
