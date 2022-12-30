package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de alunos: ");
        int quanDeAlunos = entrada.nextInt();

        System.out.print("Digite a quantidade de notas por aluno: ");
        int quanDeNotas = entrada.nextInt();

        double[] [] notasDaTurma = new double[quanDeAlunos][quanDeNotas];
        double total = 0;

        for (int a = 0; a < notasDaTurma.length; a++){
            for (int n = 0; n < notasDaTurma[a].length; n++){
                System.out.printf("Informe a nota %d do aluno %d: ", (n + 1) , (a + 1));
                notasDaTurma [a][n] = entrada.nextDouble();
                total += notasDaTurma[a][n];
            }
        }

        double media = total/(quanDeAlunos * quanDeNotas);
        System.out.println("A media da turma e: " + media);

        for (double[] notasDoAluno:notasDaTurma ) {
            System.out.println(Arrays.toString(notasDoAluno));

        }
        entrada.close();
    }
}
