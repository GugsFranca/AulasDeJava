package Controle;

import java.util.Scanner;

public class testeSwitch {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite uma option entre 0 a 10: ");
		int option = entrada.nextInt();
		
		switch(option) {
		case 1:
			System.out.print("Voc� � bicha???");
			break;
		case 2: case 3:
			System.out.println("N�o ta bom ainda lol bro");
			break;
		case 4: case 5:
			System.out.println("Tamo indo esse numero ainda � gay");
			break;
		case 6: case 7:
			System.out.println("Beleza ent�o, ok");
			break;
		case 8:
			System.out.println("Ok, bom numero!");
			break;
		case 9: case 10:
			System.out.println("Quem tu acha que �???");
			break;
		
		default: System.out.println("BRRUh Momentssksksksksks");
		
		}
		
		entrada.close();
	}
}
