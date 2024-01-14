package com.example.primeiroprojeto.atividades;

public class Divisao {

    private double dividendo;
    private double divisor;

    public double divisao() throws Exception {
        double resultado = dividendo / divisor;
        if (divisor == 0) {
            throw new Exception("Zero não é um divisor válido");
        } else {
            return resultado;
        }
    }

    public Divisao() {
    }

    public Divisao(double dividendo, double divisor) {
        this.dividendo = dividendo;
        this.divisor = divisor;
    }

    public double getDividendo() {
        return dividendo;
    }

    public void setDividendo(double dividendo) {
        this.dividendo = dividendo;
    }

    public double getDivisor() {
        return divisor;
    }

    public void setDivisor(double divisor) {
        this.divisor = divisor;
    }
}
