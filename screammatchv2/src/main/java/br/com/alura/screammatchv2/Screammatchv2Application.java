package br.com.alura.screammatchv2;

import br.com.alura.screammatchv2.model.DadosEpisodio;
import br.com.alura.screammatchv2.model.DadosSerie;
import br.com.alura.screammatchv2.service.ConsumoAPI;
import br.com.alura.screammatchv2.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Screammatchv2Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Screammatchv2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		var consumoApi = new ConsumoAPI();
		var json = consumoApi.obterDados("http://www.omdbapi.com/?t=Gilmore+Girls&apikey=5618406c");
		System.out.println(json);

//		json = consumoApi.obterDados("https://coffee.alexflipnote.dev/random.json");
//		System.out.println(json);

		ConverteDados conversor = new ConverteDados();

		DadosSerie dadosSerie = conversor.obterDados(json, DadosSerie.class);
		System.out.println(dadosSerie);

		json = consumoApi.obterDados("http://www.omdbapi.com/?t=Gilmore+Girls&season=1&episode=2&apikey=5618406c");

		DadosEpisodio dadosEpisodio = conversor.obterDados(json, DadosEpisodio.class);
		System.out.println(dadosEpisodio);
	}
}
