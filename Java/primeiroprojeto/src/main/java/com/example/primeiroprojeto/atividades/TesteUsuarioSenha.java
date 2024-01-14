package com.example.primeiroprojeto.atividades;

import java.util.Scanner;

public class TesteUsuarioSenha {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        UsuarioSenha user = new UsuarioSenha();

        try {
            System.out.println("Digite o usuário:");
            user.setUsuario(input.next());

            System.out.println("Digite a senha:");
            user.setSenha(input.next());

        }catch (SenhaInvalidaException e) {
            System.out.println(e.getMensagem());
        }
    }
}
