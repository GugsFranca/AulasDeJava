package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print(" dia!");
		
		System.out.println("Bom");//O println cria uma linha apartir de outro println
		System.out.println(" dia!");
		
		System.out.printf("\nMegaSena: %d %d %d %d %d %d \n", 1, 2, 3, 4, 5, 6);
		System.out.printf("Nome: %s\n", "Ronaldo");
		
		Scanner entrada = new Scanner(System.in); //entrada é o nome da variavel
		
		System.out.print("\nDigite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		//mesmo usando o nexrInt é nessessario usar o nextLine se não o programa não lê o que vem depois
		entrada.nextLine();
		
		System.out.println("Nome: " + nome + " " + sobrenome + "\n" + "Idade: " + idade);
		
		entrada.close();
	}
}
