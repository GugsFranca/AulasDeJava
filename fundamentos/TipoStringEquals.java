package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
	public static void main(String[] args) {
		System.out.println("2" == "2");
		System.out.println("3" == "1");// isso n�o funciona com String ou com o Scanner
		
		String s1 = new String ("2");
		System.out.println("2" == s1);
		System.out.println("2".equals(s1));//O operador == n�o funciona com Strings
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.nextLine();//O comando next retira os espa�os em branco
									//Porem o nextLine mantem os espa�os
		System.out.println(s2 == s1);
		System.out.println(s2.equals("2"));// trim() retira os espa�os em branco
		System.out.println(s1.equals(s2.trim()));
		
		entrada.close();
	}	
}
