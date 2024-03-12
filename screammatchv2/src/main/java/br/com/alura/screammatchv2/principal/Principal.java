package br.com.alura.screammatchv2.principal;

import br.com.alura.screammatchv2.model.DadosSerie;
import br.com.alura.screammatchv2.service.ConsumoAPI;
import br.com.alura.screammatchv2.service.ConverteDados;

import java.util.Scanner;

public class Principal {

    private final String ENDERECO = "https://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=5618406c";
    private ConsumoAPI consumoAPI = new ConsumoAPI();
    private ConverteDados converter = new ConverteDados();
    Scanner leitura = new Scanner(System.in);

    public void exibeMenu() {
        System.out.println("Digite o nome da série para busca:");
        var nomeSerie = leitura.nextLine();

        var json = consumoAPI.obterDados(ENDERECO + nomeSerie.replace(" ", "+") + API_KEY);

        System.out.println(json);
    }
}
