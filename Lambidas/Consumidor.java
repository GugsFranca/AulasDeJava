package Lambidas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {

        Consumer<Produto> imprimir = p -> System.out.println(p.nome);

        Produto produto = new Produto("Caneta", 2.0, 0.09);
        //imprimir.accept(produto);

        Produto produto1 = new Produto("Borracha", 0.15, 0.03);
        Produto produto2 = new Produto("Lapis", 1.0, 0.03);
        Produto produto3 = new Produto("Apontador", 0.25, 0.03);
        Produto produto4 = new Produto("Lapis de cor", 15.0, 0.10);

        List<Produto> produtos = Arrays.asList(produto, produto1, produto2, produto3, produto4);

        produtos.forEach(imprimir);
        produtos.forEach(p -> System.out.println(p.preco));
        produtos.forEach(System.out::println);


    }
}
