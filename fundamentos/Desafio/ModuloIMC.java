package fundamentos.Desafio;

import java.util.Scanner;

public class ModuloIMC {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com sua altura: ");
		double altura = entrada.nextDouble();
		System.out.println("Entre com seu peso");
		double peso = entrada.nextDouble();

		double imc = peso / (altura * altura);
		
		System.out.println(imc);
		
		entrada.close();
	}
}
