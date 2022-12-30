package Controle;

import javax.swing.JOptionPane;

public class IfElse {
	public static void main(String[] args) {
		//JOptionPane tem que ser String por isso que temos que transformar 
		//String em int
		String valor = JOptionPane.showInputDialog("Informe um numero: ");
		
		int numero = Integer.parseInt(valor);
		
		if(numero % 2 == 0) {
			System.out.println("Número Par!!");
		}else {
			System.out.println("Número Impar!");
		}
	}
}
