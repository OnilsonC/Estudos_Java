package br.com.alura;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class TestaAluno {

    public static void main(String[] args) {

        //Set<String> alunos = new HashSet<>();

        Collection<String> alunos = new HashSet<>();

        alunos.add("Onilson Cardoso");
        alunos.add("Wanessa Patricio");
        alunos.add("Helena Urbano");
        alunos.add("José Almeida");
        alunos.add("Carla Steffani");
        alunos.add("Paulo Henrique");
        alunos.add("Helena Urbano");

        System.out.println(alunos);

        for (String i : alunos) {
            System.out.println(i);
        }

        System.out.println(alunos.size());

        boolean verificaAluno = alunos.contains("Ana Joana");
        System.out.println(verificaAluno);

        alunos.remove("Onilson Cardoso");
        for (String s : alunos) {
            System.out.println(s);
        }

        alunos.forEach(System.out::println);

    }
}
