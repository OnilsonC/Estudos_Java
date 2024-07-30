package br.com.alura.screammatchv2.principal;

import br.com.alura.screammatchv2.model.DadosSerie;
import br.com.alura.screammatchv2.model.DadosTemporada;
import br.com.alura.screammatchv2.service.ConsumoAPI;
import br.com.alura.screammatchv2.service.ConverteDados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    private final String ENDERECO = "https://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=5618406c";
    private ConsumoAPI consumoAPI = new ConsumoAPI();
    private ConverteDados converter = new ConverteDados();
    Scanner leitura = new Scanner(System.in);
    List<DadosSerie> dadosSeries = new ArrayList<>();

    public void exibeMenu() {
        var opcao = -1;
        while (opcao != 0) {
            var menu = """
                    1 - Buscar séries
                    2 - Buscar episódios
                    3 - Listar séries buscadas
                                    
                    0 - Sair
                    """;
            System.out.println(menu);
            opcao = leitura.nextInt();
            leitura.nextLine();

            switch (opcao) {
                case 1:
                    buscarSerieWeb();
                    break;
                case 2:
                    buscarEpisodioPorSerie();
                    break;
                case 3:
                    listarSeriesBuscadas();
                    break;
                case 0:
                    System.out.println("Saindo ...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }

    private void buscarSerieWeb() {
        DadosSerie dados = getDadosSerie();
        dadosSeries.add(dados);
        System.out.println(dados);
    }

    private DadosSerie getDadosSerie() {
        System.out.println("Digite o nome da série para busca");
        var nomeSerie = leitura.nextLine();
        var json = consumoAPI.obterDados(ENDERECO + nomeSerie.replace(" ", "+") + API_KEY);
        DadosSerie dados = converter.obterDados(json, DadosSerie.class);
        return dados;
    }

    private void buscarEpisodioPorSerie() {
        DadosSerie dadosSerie = getDadosSerie();
        List<DadosTemporada> temporadas = new ArrayList<>();

        for (int i = 1; i <= dadosSerie.totalTemporadas(); i++) {
            var json = consumoAPI.obterDados(ENDERECO + dadosSerie.titulo().replace(" ", "+") + "&season=" + i + API_KEY);
            DadosTemporada dadosTemporada = converter.obterDados(json, DadosTemporada.class);
            temporadas.add(dadosTemporada);
        }
        temporadas.forEach(System.out::println);
    }

    private void listarSeriesBuscadas() {
        dadosSeries.forEach(System.out::println);
    }

//        Exemplos de buscas
//
//        System.out.println("Digite o nome da série para busca:");
//        var nomeSerie = leitura.nextLine();
//
//        var json = consumoAPI.obterDados(ENDERECO + nomeSerie.replace(" ", "+") + API_KEY);
//        DadosSerie dadosSerie = converter.obterDados(json, DadosSerie.class);
//      System.out.println(dadosSerie);
//
//        List<DadosTemporada> temporadas = new ArrayList<>();
//		for (int i = 1; i <= dadosSerie.totalTemporadas(); i++) {
//			json = consumoAPI.obterDados(ENDERECO + nomeSerie.replace(" ", "+") + "&season=" + i + API_KEY);
//			DadosTemporada dadosTemporada = converter.obterDados(json, DadosTemporada.class);
//
//			temporadas.add(dadosTemporada);
//		}
//		temporadas.forEach(System.out::println);
//
//        for (int i = 0; i < dadosSerie.totalTemporadas(); i++) {
//            List<DadosEpisodio> episodiosTemporada = temporadas.get(i).episodio();
//                for (int j = 0; j < episodiosTemporada.size(); j++) {
//                    System.out.println(episodiosTemporada.get(j).titulo());
//            }
//        }
//
//        temporadas.forEach(t -> t.episodio().forEach(e -> System.out.println(e.titulo())));
//
//        List<String> nomes = Arrays.asList("Onilson", "Helena", "Wanessa", "Michel");
//
//        nomes.stream()
//                .sorted()
//                .limit(2)
//                .filter(n -> n.startsWith("H"))
//                .map(n -> n.toUpperCase())
//                .forEach(System.out::println);
//
//        List<Episodio> episodios = temporadas.stream()
//                .flatMap(t -> t.episodio().stream()
//                .map(d -> new Episodio(t.numero(), d)))
//                .collect(Collectors.toList());
//
//        episodios.forEach(System.out::println);
//
//
//        List<Episodio> episodios = new ArrayList<>();
//        System.out.println("Digite um trecho do título do episódio");
//        var trechoTitulo = leitura.nextLine();
//
//        Optional<Episodio> buscaEpisodio = episodios.stream()
//                .filter(e -> e.getTitulo().toUpperCase().contains(trechoTitulo.toUpperCase()))
//                .findFirst();
//        if (buscaEpisodio.isPresent()) {
//            System.out.println("Episódio encontrado!");
//            System.out.println("Temporada: " + buscaEpisodio.get().getTemporada());
//            System.out.println("N° Episódio: " + buscaEpisodio.get().getNumeroEpisodio());
//        }else {
//            System.out.println("Episódio não encontrado.");
//        }
//
//
//        System.out.println("\nTop 10 episódios da série:");
//        dadosEpisodios.stream()
//                        .filter(e -> !e.avaliacao().equalsIgnoreCase("N/A"))
//                        .peek(e -> System.out.println("Filtrar os que nao tem N/A " + e))
//                        .sorted(Comparator.comparing(DadosEpisodio::avaliacao).reversed())
//                        .peek(e -> System.out.println("Ordenação " + e))
//                        .map(e -> e.titulo().toUpperCase())
//                        .peek(e -> System.out.println("Mapeamento maiúsculas " + e))
//                        .limit(10)
//                        .forEach(System.out::println);
//
//        List<Episodio> episodios2 = temporadas.stream()
//                .flatMap(t -> t.episodio().stream()
//                        .map(d -> new Episodio(t.numero(), d))
//                ).collect(Collectors.toList());
//
//        episodios2.forEach(System.out::println);
//
//        System.out.println("A partir de qual data pretende realizar a busca? ");
//        var ano = leitura.nextInt();
//        leitura.nextLine();
//
//        LocalDate buscaData = LocalDate.of(ano, 1, 1);
//        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//
//        episodios.stream()
//                .filter(e -> e.getDataLancamento() != null && e.getDataLancamento().isAfter(buscaData))
//                .forEach(e -> System.out.println(
//                        "Temporada " + e.getTemporada() + " [" +
//                                "Episodio " + e.getTitulo() +
//                                " Data lançamento " + e.getDataLancamento().format(df) + "]"
//                ));
//
//        Map<Integer, Double> buscaAvaliacaoTemporada = episodios.stream()
//                .filter(e -> e.getAvaliacao() > 0.0)
//                .collect(Collectors.groupingBy(Episodio::getTemporada,
//                        Collectors.averagingDouble(Episodio::getAvaliacao)));
//        System.out.println(buscaAvaliacaoTemporada);
//
//        DoubleSummaryStatistics est = episodios
//                .stream()
//                .filter(e -> e.getAvaliacao() > 0.0)
//                .collect(Collectors.summarizingDouble(Episodio::getAvaliacao));
//        System.out.println("Média: " + est.getAverage());
//        System.out.println("episódio com pior avaliação: " + est.getMin());
//        System.out.println("episódio com maior avaliação: " + est.getMax());

    }
