package com.example.primeiroprojeto.streammatch;

public class Series extends Titulo {

    private int temporadas;

    public Series(String nome, int anoLancamento) {
        super(nome, anoLancamento);
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    @Override
    public String toString() {
        return  "{" +
                "nome='" + getNome() + '\'' +
                ", anoLancamento=" + getAnoLancamento() +
                '}';
    }
}


