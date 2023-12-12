import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ComprasTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o limite do cartão: ");
        double limite = input.nextDouble();
        CartaoCredito cartaoCredito = new CartaoCredito(limite);

        int opcao = 1;

        while (opcao != 0) {

            System.out.println("Digite a descrição do produto: ");
            String descricao = input.next();

            System.out.println("Digite o valor do produto: ");
            double valor = input.nextDouble();

            Compra listaCompras = new Compra(descricao, valor);

            boolean confirmaCompra = cartaoCredito.adicionaLista(listaCompras);

            if (confirmaCompra) {
                System.out.println("Compra realizada");
                System.out.println("Digite 0 para sair ou 1 para continuar");
                opcao = input.nextInt();
            } else {
                System.out.println("Saldo insuficiente!");
                opcao = 0;
            }
        }
            System.out.println("Compras realizadas");
            Collections.sort(cartaoCredito.getCompras());
            for (Compra c : cartaoCredito.getCompras()) {
                System.out.println(c.getDescrição() + " - " + c.getValor());
        }
                System.out.println();
                System.out.println("Saldo R$ " + cartaoCredito.getSaldo());
    }
}
