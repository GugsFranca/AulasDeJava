package Controle.Desafio;

import java.util.Scanner;

public class Conclusao4 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int div = 0;
		
		System.out.print("Digite um numero: ");
		int num = entrada.nextInt();
		
		for(int x = 1; x <= num; x++) {
			if(num % x == 0) {
				div++;
			}
		}
		
		switch (div) {
		case 2: 
			System.out.println("Esse numero é primo");
			break;
		
		default:
			System.out.println("Esse número não é primo");
		}
		
		entrada.close();
	}
}
