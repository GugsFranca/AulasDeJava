package fundamentos.Operadores;

public class OperadoresRelacionais {
	public static void main(String[] args) {
		
		int a = 97;
		int b = 'a'; //a equivale a 97 em hexadecimal
		
		System.out.println(a == b);
		System.out.println(30 != 7);
		
		System.out.println(3 < 4);
		System.out.println(2 > 1);
		System.out.println(3 >= 3);
		System.out.println(3 <= 7);
		
		double nota = 9.7;
		boolean passoupormedia = nota >= 7;
		boolean bomcomportamento = true;
		boolean temdesconto = bomcomportamento && passoupormedia;
		
		System.out.println("O aluno tem desconto? " + temdesconto);
		
	}
}
