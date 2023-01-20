package excecao;

import java.util.Scanner;

public class Finally {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        try {
            System.out.println(7 / entrada.nextInt()); 
            entrada.close();

        } catch (OutOfMemoryError e) {//Com o Exception ou o ArithmeticException ele continuaria para Fim
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Finalmente...");
            entrada.close();
        }
        System.out.println("Fim");
    }
}
