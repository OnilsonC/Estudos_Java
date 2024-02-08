import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {

        Filme filme1 = new Filme();
        filme1.setNome("O Podesoso Chefão");
        filme1.setAnoDeLancamento(1972);
        filme1.setDuracaoEmMinutos(180);

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

        lost.avalia(6);
        lost.avalia(7);
        lost.avalia(7.8);

        System.out.println("Total de avaliações da série Lost: " + lost.getTotalDeAvaliacoes());
        System.out.println("Média de avaliações da série Lost: " + lost.mediaAvaliacao());

        System.out.println("Total em minutos da série Lost: " + lost.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();

        System.out.println(calculadora.calculaTempo(filme1));
        System.out.println(calculadora.calculaTempo(lost));
    }
}