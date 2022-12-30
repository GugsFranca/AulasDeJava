package Controle.Desafio;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String desejo = "";
		
		while(!desejo.equalsIgnoreCase("sair")) {
			System.out.println("Entre com o desejado: ");
			desejo = entrada.nextLine();
			System.out.println("Eita rapaz que isso");
			System.out.println("Quer sair não é");
			System.out.println("Vamos de novo...");
		
		}
		System.out.println("Eita saiu memokkkk");
		
		entrada.close();
	}
}
