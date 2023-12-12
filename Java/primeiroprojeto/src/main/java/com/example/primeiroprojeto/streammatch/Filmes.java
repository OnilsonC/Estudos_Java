package com.example.primeiroprojeto.streammatch;

public class Filmes extends Titulo {

    private int avaliacao;

    public Filmes(String nome, int anoLancamento) {
        super(nome, anoLancamento);
    }

    public int getAvaliacao() {
        return  avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + getNome() + '\'' +
                ", anoLancamento=" + getAnoLancamento() +
                '}';
    }
}
