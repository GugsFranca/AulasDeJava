package Lambidas.Desafio;

import classe.Produto;

import java.text.DecimalFormat;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioBinarysMeu {


    public static void main(String[] args) {
        Produto p = new Produto("GtaSA", 3235.89, 0.13);
        DecimalFormat arredondado = new DecimalFormat("0.00");

        BinaryOperator<Double> calculo = (preco, desconto) -> preco * (1 - desconto);
        UnaryOperator<Double> imposto = calc -> calc >= 2500 ? (calc * (1 + 8.5)): calc;
        UnaryOperator<Double> frete = valorFim -> valorFim >= 3000 ? (valorFim + 100) : (valorFim + 50);
        Function<Double, String> formatar = preco -> ("R$" + preco).replace(".", ",");


        String preco = arredondado.format(calculo
                .andThen(imposto)
                .andThen(frete)
                .apply(p.preco, Produto.getDesconto()));

        System.out.println("R$" + preco.replace(".", ","));


    }
}
