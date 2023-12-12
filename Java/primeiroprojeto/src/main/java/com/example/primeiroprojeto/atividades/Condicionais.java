package com.example.primeiroprojeto.atividades;

public class Condicionais {
    public static void main(String[] args) {

        int anoLancamento = 2022;
        boolean clientePremium = true;
        String condicaoCliente = "plus";

        if (clientePremium == false || condicaoCliente.equals("plus")) {
            System.out.println("Cliente ativo para assistir a programação");
        } else {
            System.out.println("Favor seguir com o cadastro para assistir a promamação");
        }
    }
}
