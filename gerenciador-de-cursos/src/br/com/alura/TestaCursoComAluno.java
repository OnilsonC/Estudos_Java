package br.com.alura;

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
        javaColecoes.getAlunos().forEach(System.out::println);

        Aluno a4 = new Aluno("Rael", 998554);
        javaColecoes.matricular(a4);

        javaColecoes.getAlunos().forEach(System.out::println);

    }
}
