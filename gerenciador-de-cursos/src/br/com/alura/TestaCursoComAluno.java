package br.com.alura;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {

    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Trabalhando com coleções", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Novo Curso Java", 25));
        javaColecoes.adiciona(new Aula("Spring Boot", 21));
        javaColecoes.adiciona(new Aula("Certificacao Java SE 8 Programmer I", 28));

        Aluno a1 = new Aluno("Onilson Cardoso", 1577);
        Aluno a2 = new Aluno("Wanessa Patricio", 13998);
        Aluno a3 = new Aluno("Carla Steffani", 196638);

        javaColecoes.matricular(a1);
        javaColecoes.matricular(a2);
        javaColecoes.matricular(a3);

        System.out.println("Todos os alunos matriculados:");
//        javaColecoes.getAlunos().forEach(System.out::println);

        //Forma antiga de iterar coleções:
        Set<Aluno> alunos = javaColecoes.getAlunos();
        Iterator<Aluno> iterador = alunos.iterator();
        while (iterador.hasNext()) {
            Aluno proximo = iterador.next();
            System.out.println(proximo);
        }

        Aluno a4 = new Aluno("Rael", 998554);
        javaColecoes.matricular(a4);

//        javaColecoes.getAlunos().forEach(System.out::println);

        System.out.println("O aluno " + a1 + " está matriculado?");
        System.out.println(javaColecoes.estaMatriculado(a1));

        Aluno onilson = new Aluno("Onilson Cardoso", 1577);
        System.out.println("E esse onilson está matriculado? " + javaColecoes.estaMatriculado(onilson));

        System.out.println("O objeto onilson é igual ao obj a1? ");
        System.out.println(a1.equals(onilson));

        System.out.println(a1.hashCode() == onilson.hashCode());

//        for (Aluno a : javaColecoes.getAlunos()) {
//            System.out.println(a);
//        }
    }
}
