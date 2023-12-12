

public class Compra implements Comparable<Compra> {

    private String descrição;
    private double valor;

    public Compra(String descrição, double valor) {
        this.descrição = descrição;
        this.valor = valor;
    }

    public String getDescrição() {
        return descrição;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return " descrição='" + descrição +
                " valor=" + valor;
    }

    @Override
    public int compareTo(Compra outraCompra) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(outraCompra.valor));
    }
}
