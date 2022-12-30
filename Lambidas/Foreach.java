package Lambidas;

import java.util.Arrays;
import java.util.List;

public class Foreach {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Ana", "Bia" , "Lia", "Gui");

        System.out.println("Metodo Classico");
        for (String nome : aprovados){
            System.out.println(nome + " e gay!");
        }

        System.out.println("\nLambida #01...");
//      aprovados.forEach((nome) -> {System.out.println(nome + " eitakkk!!");});
        aprovados.forEach(nome -> System.out.println(nome + " eitakkk!!"));

        System.out.println("\nMethod Reference #01");
        aprovados.forEach(System.out::println);

        System.out.println("\nLambida #02...");
        aprovados.forEach(nome -> meuImprimir(nome));

        System.out.println("\nMethod Reference #02");
        aprovados.forEach(Foreach::meuImprimir);

    }
    static void meuImprimir(String nome){
        System.out.println("Oi! Meu nome e "+ nome);
    }
}
