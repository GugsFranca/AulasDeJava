package Lambidas;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class OperadorUnario {
    public static void main(String[] args) {

        UnaryOperator<Integer> maisDois = n -> n +2;
        UnaryOperator<Integer> vezesDois = n -> n * 2;
        UnaryOperator<Integer> aoQuadrado = n -> n * n;

        int resultado1 = maisDois
                .andThen(vezesDois)
                .andThen(aoQuadrado)
                .apply(0);
        System.out.println(resultado1);


        int resultado2 = maisDois //compose funciona de baixo para cima e o apply funciona naturalmente
                .compose(vezesDois)
                .compose(aoQuadrado)
                .apply(0);
        System.out.println(resultado2);

        }
    }

