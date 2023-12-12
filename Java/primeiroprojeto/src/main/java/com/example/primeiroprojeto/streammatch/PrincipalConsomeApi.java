package com.example.primeiroprojeto.streammatch;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalConsomeApi {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome do filme: ");
        var busca = input.nextLine();

        String endereco = "http://www.omdbapi.com/?t=" + busca + "&apikey=5618406c";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        System.out.println(json);

        Gson gson = new Gson();
        Titulo meuTitulo = gson.fromJson(json, Titulo.class);

        System.out.println(meuTitulo);
    }
}
