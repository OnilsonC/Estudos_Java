package br.com.loja.imposto;

import br.com.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {

    public BigDecimal calcular(Orcamento orcamento, Imposto tipoImposto) {
        return tipoImposto.calcular(orcamento);

//        switch (tipoImposto) {
//            case ICMS:
//                return orcamento.getValor().multiply(new BigDecimal("0.1"));
//            case ISS:
//                return orcamento.getValor().multiply(new BigDecimal("0.06"));
//            default:
//                return BigDecimal.ZERO;
//        }
    }
}
