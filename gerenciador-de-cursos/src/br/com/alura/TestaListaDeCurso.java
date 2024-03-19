package br.com.alura;

import java.util.List;

public class TestaListaDeCurso {
    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Trabalhando com coleções", "Paulo Silveira");

        List<Aula> aulas = javaColecoes.getAulas();
        System.out.println(aulas);

        aulas.add(new Aula("Spring Boot", 21));
        System.out.println(aulas);

        System.out.println(javaColecoes.getAulas());

        System.out.println(aulas == javaColecoes.getAulas());
    }
}
