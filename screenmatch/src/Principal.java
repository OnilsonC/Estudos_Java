import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {

        Filme filme1 = new Filme();
        filme1.setNome("O Podesoso Chefão");
        filme1.setAnoDeLancamento(1972);

        filme1.exibeFichaTecnica();

        filme1.avalia(8);
        filme1.avalia(6);
        filme1.avalia(10);

        System.out.println("Total das avaliações: " + filme1.getTotalDeAvaliacoes());

        System.out.println("Média de avaliações: " + filme1.mediaAvaliacao());

        Serie lost = new Serie();

        lost.setNome("Lost");
        lost.setAnoDeLancamento(2004);
        lost.setTemporadas(6);
        lost.setMinutosPorEpisodio(50);
        lost.setEpisodiosPorTemporada(10);
        lost.exibeFichaTecnica();

        System.out.println("Total em minutos da série Lost: " + lost.getDuracaoEmMinutos());
    }
}