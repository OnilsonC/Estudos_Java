package br.com.alura.screammatchv2;

import br.com.alura.screammatchv2.model.DadosEpisodio;
import br.com.alura.screammatchv2.model.DadosSerie;
import br.com.alura.screammatchv2.model.DadosTemporada;
import br.com.alura.screammatchv2.principal.Principal;
import br.com.alura.screammatchv2.service.ConsumoAPI;
import br.com.alura.screammatchv2.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

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

		List<DadosTemporada> temporadas = new ArrayList<>();

		for (int i = 1; i <= dadosSerie.totalTemporadas(); i++) {
			json = consumoApi.obterDados("http://www.omdbapi.com/?t=Gilmore+Girls&season="+i+"&apikey=5618406c");
			DadosTemporada dadosTemporada = conversor.obterDados(json, DadosTemporada.class);

			temporadas.add(dadosTemporada);
		}
		temporadas.forEach(System.out::println);

		Principal principal = new Principal();

		principal.exibeMenu();
	}
}
