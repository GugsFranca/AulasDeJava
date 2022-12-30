package Controle.Desafio;

import java.util.Scanner;

public class Conclusao8 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite uma palavra");
		String palava = entrada.nextLine();
		
		char letra[] = palava.toCharArray();//Troca String para Char
		//length pega o numero de letras na palavra String
		for(int x = 0; x < letra.length; x++) {
			System.out.println(letra[x]);
		}
		
		entrada.close();
	}
}
