package com.example.primeiroprojeto.atividades;

public class UsuarioSenha {
    private String usuario;
    private String senha;

    public UsuarioSenha(String usuario, String senha){
        this.usuario = usuario;
        this.senha = senha;
    }

    public  UsuarioSenha() {
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        if (senha.length() < 8) {
            throw new SenhaInvalidaException("A senha deve ter no mínimo 8 caracteres");
        }else {
            System.out.println("senha cadastrada");
        }
        this.senha = senha;
    }
}
