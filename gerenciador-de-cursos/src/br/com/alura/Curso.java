package br.com.alura;

import java.util.*;

public class Curso {
    private String nome;
    private String instrutor;
    private List<Aula> aulas = new ArrayList<>();
    private Set<Aluno> alunos = new HashSet<>();

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public void adiciona(Aula aula) {
        this.aulas.add(aula);
    }

    public int somaTempo() {
//        int total = 0;
//        for (Aula aula : aulas) {
//            total += aula.getTempo();
//        }
//        return total;
        return aulas.stream().mapToInt(Aula::getTempo).sum();
    }

    public void matricular(Aluno aluno) {
        this.alunos.add(aluno);
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome = " + nome +
                ", instrutor = " + instrutor +
                ", TempoTotal = " + this.somaTempo() +
                ", aulas = " + getAulas() +
                "}";
    }
}
