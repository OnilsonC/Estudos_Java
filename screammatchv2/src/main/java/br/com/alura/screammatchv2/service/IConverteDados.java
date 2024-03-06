package br.com.alura.screammatchv2.service;

public interface IConverteDados {

    <T> T obterDados(String json, Class<T> classe);
}
