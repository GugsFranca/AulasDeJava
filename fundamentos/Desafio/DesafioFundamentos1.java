package fundamentos.Desafio;

import java.util.Scanner;

public class DesafioFundamentos1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Entre com uma temperatura em Fahrenheit: ");
		double usa = entrada.nextDouble();
		System.out.print("Entre com uma temperatura em Celsius: ");
		double world = entrada.nextDouble();
		
		double tempusa = (world - 32) * 5/9;
		double tempworld = (usa * 9/5) + 32;
		
		System.out.printf("\nFahrenheit para Celsius: %.2f" , tempworld);
		System.out.printf("\nCelsius para Fahrenheit: %.2f", tempusa);
		
		entrada.close();
	}
}
