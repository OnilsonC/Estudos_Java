package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
<<<<<<< HEAD

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

=======
    private int tempoTotal;

//    public void inclui(Filme f) {
//        this.tempoTotal += f.getDuracaoEmMinutos();
//    }
//    public void inclui(Serie s) {
//        this.tempoTotal += s.getDuracaoEmMinutos();
//    }

    public void inclui(Titulo t) {
        this.tempoTotal += t.getDuracaoEmMinutos();
    }
>>>>>>> 16a6385533e6cd4fbe71859c67ff9016ebbc5b1b
    public int getTempoTotal() {
        return tempoTotal;
    }
}
