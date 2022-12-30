package Controle.Desafio;

import java.util.Scanner;

public class Conclusao1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
			
		System.out.print("Digite um numero de 0 a 10: ");
		 int numero = entrada.nextInt();
		
		if(numero >= 0 && numero <= 10) {
			System.out.println("Esse número é valido!!");
		}else {
			System.out.println("Número invalido");
		}
		
		if(numero % 2 == 0) {
			System.out.println("Número par");
		}else 
			System.out.println("Número impar");
		
	
		entrada.close();
	}
}
