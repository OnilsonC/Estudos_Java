package br.com.alura.screammatchv2;

import br.com.alura.screammatchv2.service.ConsumoAPI;
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
		var json = consumoApi.obterDados("http://www.omdbapi.com/?t=Gilmore+Girls&season=1&apikey=5618406c");
		System.out.println(json);

		json = consumoApi.obterDados("https://coffee.alexflipnote.dev/random.json");
		System.out.println(json);
	}
}
