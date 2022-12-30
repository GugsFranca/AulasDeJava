package fundamentos.Conversao;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	public static void main(String[] args) {
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro numero: ");
		String valor2 = JOptionPane.showInputDialog("Digite o segundo numero: ");
		
		System.out.println(valor1 + valor2);
		
		double nume1 = Double.parseDouble(valor1);
		double nume2 = Double.parseDouble(valor2);
		
		double soma = nume1 + nume2;
		System.out.println("A soma e " + soma);
		System.out.println("A media � " + soma/2);
		System.out.printf("A media e %.1f ", soma/2);//isso cria apenas uma casa decimal
		
		
						
	}

}
