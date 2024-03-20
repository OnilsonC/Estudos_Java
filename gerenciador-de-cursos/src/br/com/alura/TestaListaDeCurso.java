package br.com.alura;

import java.util.ArrayList;
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
        System.out.println(javaColecoes.getAulas());

        List<Curso> listaImutavel = new ArrayList<>();
//        listaImutavel.add(javaColecoes);

        List<Curso> listas = new ArrayList<>(listaImutavel);
        listas.add(javaColecoes);

        System.out.println(listas);

        System.out.println(aulas == javaColecoes.getAulas());

        System.out.println(javaColecoes.somaTempo());

    }
}
