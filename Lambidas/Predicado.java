package Lambidas;

import java.util.function.Predicate;

public class Predicado {
    public static void main(String[] args) {
        Predicate<Produto> isCaro = prod -> (prod.preco * (1 - prod.desconto)) >= 1000;

        Produto produto = new Produto("Notebook", 3800,0.25);

        System.out.println(isCaro.test(produto));
    }
}
