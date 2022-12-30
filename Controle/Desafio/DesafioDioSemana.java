package Controle.Desafio;

import java.util.Scanner;

public class DesafioDioSemana {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o Dia da Semana: ");
		String dia = entrada.nextLine();
		
		if(dia.toLowerCase().equals("domingo")) {
			System.out.println("Dia igual a 1");
		}else if(dia.toLowerCase().equals("segunda")) {
			System.out.println("Dia igual a 2");
			
		}else if(dia.equalsIgnoreCase("terça")) {
			System.out.println("Dia igual a 3");
			
		}else if(dia.toLowerCase().equals("quarta")) {
			System.out.println("Dia igual a 4");
			
		}else if(dia.toLowerCase().equals("quinta")) {
			System.out.println("Dia igual a 5");
			
		}else if(dia.toUpperCase().equals("SEXTA")) {
			System.out.println("Dia igual a 6");
			
		}else if(dia.toLowerCase().equals("sabado")) {
			System.out.println("Dia igual a 7");
			
		}else {
			System.out.println("Entrada invalida");
		}
		entrada.close();
	}
}
