package Lambidas.Desafio;

import classe.Produto;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioBinarysCurso {
    public static void main(String[] args) {

        Function<Produto, Double> precoFinal = p -> p.preco * (1 - Produto.desconto);
        UnaryOperator<Double> impostoMuni = preco -> preco >= 2500 ? (preco * (1 + 8.5)): preco;
        UnaryOperator<Double> frete = preco -> preco >= 3000 ? (preco + 100) : (preco + 50);;
        Function<Double, String> arredondar = preco -> String.format("%.2f", preco);
        Function<String, String> formatar = preco -> ("R$" + preco).replace(".", ",");

        Produto p = new Produto("GtaSA", 3235.89, 0.13);

        String preco = precoFinal
                .andThen(impostoMuni)
                .andThen(frete)
                .andThen(arredondar)
                .andThen(formatar)
                .apply(p);
        System.out.println("O Preco final e " + preco);
    }
}
