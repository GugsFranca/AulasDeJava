package Lambidas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {
    public static void main(String[] args) {

        // ? interrogacao significa resultado e: significa se nao
        // caso aconteca o resultado[?] sera tal e caso contrario[:] sera outro

        BinaryOperator<Double> media = (n1,n2) -> (n1 + n2) / 2;
        System.out.println(media.apply(9.8,5.7));

        BiFunction<Double, Double, String> resultado =
                (n1, n2) -> ((n1 + n2) / 2) >= 7 ? "Aprovado" : "Reprovado";

        BiFunction<Double, Double, String> resultado2 = (n1, n2) -> {
            double notaFinal = (n1 + n2) / 2;
            return notaFinal >= 7 ? notaFinal + " Aprovado" : "Reprovado";
        };

        System.out.println(resultado.apply(9.7, 4.2));
        System.out.println(resultado2.apply(8.9, 7.4));

        Function<Double, String> conceito = m -> m >= 7 ? "Aprovado" : "Reprovado";

        System.out.println(media.andThen(conceito).apply(9.8 , 5.7));

    }
}
