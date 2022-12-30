package fundamentos.Desafio;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		//num1 num2
		// + - * / %
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Entre com o primeiro numero: ");
		double num1 = entrada.nextDouble();
		entrada.nextLine();
		
		System.out.print("Entre como o segundo numero: ");
		double num2 = entrada.nextDouble();
		entrada.nextLine();
		
		System.out.print("Qual tipo de operação você deseja? ");
		String operacao = entrada.next();
		
		double 
		resultado = "+".trim().equals(operacao) ? num1 + num2 :0;
		resultado = "-".equals(operacao) ? num1 + num2 :resultado;
		resultado = "*".equals(operacao) ? num1 * num2 :resultado;
		resultado = "/".equals(operacao) ? num1 / num2 :resultado;
		resultado = "%".equals(operacao) ? num1 % num2 :resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, operacao, num2, resultado);
		
		entrada.close();
	}
}
