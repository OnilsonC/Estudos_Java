package com.example.primeiroprojeto.streammatch;

import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo>{
    //@SerializedName("Title")
    private String nome;
    //@SerializedName("Year")
    private int anoLancamento;
    private int duracaoEmMinutos;
    private double somaAvaliacoes;
    private int totalAvaliacao;

    public Titulo() {
    }

    public Titulo(String nome, int anoLancamento) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
    }

    public Titulo(TituloOmdb tituloOmdb) {
        if (tituloOmdb.getYear().length() > 4) {
            throw new ErroDeConversaoDeAnoException("Não consegui converter o ano " +
                    "porque tem mais de 04 caracteres");
        }
        this.nome = tituloOmdb.getTitle();
        this.anoLancamento = Integer.valueOf(tituloOmdb.getYear());
        this.duracaoEmMinutos = Integer.valueOf(tituloOmdb.getRuntime().substring(0,2));
    }

    public void avalia(int nota) {
        somaAvaliacoes += nota;
        totalAvaliacao++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public double getSomaAvaliacoes() {
        return somaAvaliacoes;
    }

    public void setSomaAvaliacoes(double somaAvaliacoes) {
        this.somaAvaliacoes = somaAvaliacoes;
    }

    public int getTotalAvaliacao() {
        return totalAvaliacao;
    }

    public void setTotalAvaliacao(int totalAvaliacao) {
        this.totalAvaliacao = totalAvaliacao;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    @Override
    public int compareTo(Titulo t) {
        return getNome().compareTo(t.getNome());
    }

    @Override
    public String toString() {
        return  "nome='" + nome + '\'' +
                ", anoLancamento=" + anoLancamento + '\'' +
                ", duraçãoEmMinutos=" + duracaoEmMinutos;
    }
}
