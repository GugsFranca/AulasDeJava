package fundamentos.Desafio;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
			
		System.out.print("Digite o primerio salario: ");
		String prim = entrada.nextLine().replace(",", ".");
		
		System.out.print("Digite o segundo salario: ");
		String seg = entrada.nextLine().replace(",", ".");
		
		System.out.print("Digite o terceiro salario: ");
		String ter = entrada.nextLine().replace(",", ".");
		
		double num1 = Double.parseDouble(prim);
		double num2 = Double.parseDouble(seg);
		double num3 = Double.parseDouble(ter);
		
		double soma = num1 + num2 + num3;
		
		System.out.println("A soma é igua a "+ soma);
		System.out.printf("E a média é igual a %.2f", soma/3);
		
		entrada.close();
}
}
