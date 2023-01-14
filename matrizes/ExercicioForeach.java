package matrizes;

import java.util.Arrays;

public class ExercicioForeach {
    public static void main(String[] args) {
        double[] notasAlunoA = new double[3];
        //double notasAlunoA [] = new double[3];
        System.out.println(Arrays.toString(notasAlunoA));

        notasAlunoA[0] = 7.5;
        notasAlunoA[1] = 9;
        notasAlunoA[2] = 6.7;

        System.out.println(Arrays.toString(notasAlunoA));
        System.out.println(notasAlunoA[0]);
        System.out.println(notasAlunoA[notasAlunoA.length-1]);


        double total =0;
        for (double notaAlunoA: notasAlunoA){
            System.out.println(notaAlunoA);
            total += notaAlunoA;
        }
        total = total/notasAlunoA.length;

        System.out.printf( "%.2f" ,total);

        double[] notasAlunoB = {6.4, 3.9, 8.9,9};
        double totalAlunoB = 0;

        for(double notaAlunoB: notasAlunoB){

            totalAlunoB += notaAlunoB;
            System.out.println(notaAlunoB);
        }
        System.out.println(totalAlunoB/notasAlunoB.length);

    }
}
