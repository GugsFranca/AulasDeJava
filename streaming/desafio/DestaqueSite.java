package streaming.desafio;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class DestaqueSite {
    public static void main(String[] args) {
        ProdutosSite p1 = new ProdutosSite("Notebook",2000.5, 30, false);
        ProdutosSite p2 = new ProdutosSite("Iphone 12", 10000, 5, true);
        ProdutosSite p3 = new ProdutosSite("Tablet", 500, 40, true);
        ProdutosSite p4 = new ProdutosSite("Quadro do Naruto", 15, 30, false);
        ProdutosSite p5= new ProdutosSite("Magnum", 3000, 60, true);

        List<ProdutosSite> produtos = Arrays.asList(p1, p2, p3, p4, p5);

        Predicate<ProdutosSite> descontao = d -> d.desconto >= 30;
        Predicate<ProdutosSite> freteGratis = f -> f.frete;
        Function<ProdutosSite, String> protudo = d -> "Corre por que temos " + d.nome+ " saindo por "+ d.valorReal(d.preco, d.desconto) + " com " + d.desconto + "% de desconto";

        produtos.stream()
        .filter(descontao)
        .filter(freteGratis)
        .map(protudo)
        .forEach(System.out::println);
    }
}
