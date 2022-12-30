package Controle;

import java.util.Scanner;

public class SwitchcomBreak {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a nota: ");
		int nota =  entrada.nextInt();
		String conceito = "";
		
		switch (nota) {
		case 10: case 9:
			conceito = "A";
			break;
		case 8: 
		case 7:
			conceito = "B";
			break;
		case 6: case 5:
			conceito = "C";
			break;
		case 4: case 3:
			conceito = "D";
			break;
		case 2: case 1: case 0:
			conceito = "F";
			break;
		default:
			conceito = "Não existe!";
		}
		System.out.println("Conceito é igual a " + conceito);
		entrada.close();
	}
}
