package matrizes.desafio;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de notas: ");
         int i = entrada.nextInt();
        entrada.nextLine();

        double[] notas = new double[i];


        for (int x = 0; x < notas.length; x++){
            System.out.print("Digite a "+ (x+1) +"� nota: ");
            notas[x] = entrada.nextInt();
        }

        System.out.println(Arrays.toString(notas));

        double soma = 0;
        for (double nota: notas){
            soma+=nota;
        }
        System.out.println("A m�dia � igual a: " + soma/notas.length);
        entrada.close();

    }
}
