package classe.Desafios;

import java.util.Scanner;

public class DesafioJantar {
	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		DesafioPessoa p = new DesafioPessoa();
		DesafioComida c = new DesafioComida();
		double pesofim = p.peso;
		int op;
		do {
		System.out.println("Digite oque desa comer:");
		System.out.println(c.arroz);
		System.out.println(c.macarrao);
		System.out.println(c.bolo);
		System.out.println("4- sair");
		 op = entrada.nextInt();
		entrada.nextLine();
		switch (op) {
		case 1: {
			pesofim += c.pesoArrozcomfeijao;
			System.out.println(p.nome + "esta com "+ pesofim +" kl");
			
			break;
		}
		case 2:{
			pesofim += c.pesomacarrao;
			System.out.println(p.nome + "esta com " + pesofim + " kl");
			break;
		}
		case 3:{
			pesofim += c.pesobolo;
			System.out.println(p.nome + "esta com " + pesofim + " kl");
			break;
		}
		case 4:{
			
			System.out.println(p.nome + "esta com " + pesofim + " kl");
			System.out.println("Seu peso anterior era de: " + p.peso);
			break;
		}
		default:
			System.out.println("Entrada invalida");
		}

		}while(op != 4);
		
		entrada.close();
		
	}
}
