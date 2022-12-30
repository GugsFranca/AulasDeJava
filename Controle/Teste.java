package Controle;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("informe a média: ");
        double nota = entrada.nextDouble();

        if(nota <= 10 && nota >= 7.0) {
            System.out.println("Aprovado!!!");
            System.out.println("Parabens!");
        }

        if(nota < 7 && nota >= 4.5)
            System.out.println("Recuperação");

        boolean reprovacao = nota <4.5 && nota >= 0;

        if(reprovacao) {
            System.out.println("Reprovado");
        }

        entrada.close();

    }
}

