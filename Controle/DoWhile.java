package Controle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String palavra = "";
		
		do {
			System.out.println("\nDiga as palavras magicas...");
			System.out.print("Você sabe qual?");
			palavra = entrada.nextLine();
			
		}while(!palavra.equalsIgnoreCase("por favor"));
		
		System.out.println("Boa meu garoto");
		
		entrada.close();
	}
}
