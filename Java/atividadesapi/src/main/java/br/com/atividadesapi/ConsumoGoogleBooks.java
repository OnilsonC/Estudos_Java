package br.com.atividadesapi;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ConsumoGoogleBooks {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome do livro: ");
        var livro = input.nextLine();

        String endereco = "https://www.googleapis.com/books/v1/volumes?q=" + livro + "&key=AIzaSyAdWPjKwRVm_3z6g2YWKuEo64zAnCONh-w";

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        //System.out.println(json);

        //Gson gson = new Gson();
        //LivrosGoogle livros = gson.fromJson(json, LivrosGoogle.class);


        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();
        LivrosGoogleImpl livros = gson.fromJson(json, LivrosGoogleImpl.class);
        System.out.println(livros);

        LivrosGoogle livrosImpl = gson.fromJson(json, LivrosGoogle.class);

        LivrosGoogle livrosGoogle = new LivrosGoogle(livros);

        System.out.println(livrosGoogle);
    }
}
