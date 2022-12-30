package Lambidas;

import java.util.function.Function;

public class Funca{
    public static void main(String[] args) {

        Function<Integer, String> parOuImpar = n -> n % 2 == 0 ? "Par" : "Impar";


        Function<String,String> oResutadoE = valor -> "O resultado e: " + valor;

        Function<String, String> empougado = valor ->   valor + "!!!!!!";

        Function<String, String> duvida = valor ->   valor + "?????";



        System.out.println(parOuImpar.apply(33));
        String resultadoFinal = parOuImpar.andThen(oResutadoE).andThen(empougado).apply(32);
        String resultadoFinal2 = parOuImpar.andThen(oResutadoE).andThen(duvida).apply(35);
        System.out.println(resultadoFinal);
        System.out.println(resultadoFinal2);

    }
}
