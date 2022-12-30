package Controle.Desafio;

import java.util.Scanner;

public class DesafioWhile2 {
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	double nota = 0;
	double x = 0;
	int quantidade = 0;
	
	do {
		
		System.out.print("Digite uma nota valida: ");
		nota = entrada.nextDouble();
		
		if(nota >= 0 && nota<= 10) {
		x = nota + x;//x += nota
		quantidade++;
		}else if(nota != -1){
			System.out.println("Nota invalida gay");
		}
		
	}while(nota != -1);
	
	double total = x / quantidade;
	System.out.println("A média é igual a " + total);
	entrada.close();
}
}
