package Controle.Desafio;

import java.util.Scanner;

public class Conclusao9 {
	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		int valor = 0;
		int maiorvalor = 0;
		int x = 0;
		
		do {
			System.out.print("Digite um numero: ");
				valor = entrada.nextInt();
				entrada.nextLine();
				
			if(maiorvalor < valor) {
				maiorvalor = valor;
			}

			x++;
			
		}while(x != 10);
		
		System.out.printf("O maior valor é %d", maiorvalor);
		
		entrada.close();
	}
}
