package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {

    private int tempoTotal;

//    public void inclui(Filme f) {
//        tempoTotal += f.getDuracaoEmMinutos();
//    }
//
//    public void inclui(Serie s) {
//        tempoTotal += s.getDuracaoEmMinutos();
//    }

    //polimorfismo
    public void inclui(Titulo t) {
        this.tempoTotal += t.getDuracaoEmMinutos();
    }

    public int getTempoTotal() {
        return tempoTotal;
    }
}
