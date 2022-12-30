package fundamentos.Desafio;

public class DesafioLogicos {
	public static void main(String[] args) {
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		
		boolean TV32 = trabalho1 ^ trabalho2;
		boolean TV50 = trabalho1 && trabalho2;
		boolean sorvete = TV32 || TV50;
		boolean saldavel = !sorvete;
		
		System.out.println("A familia vai comprar a TV de 32? " + TV32);
		System.out.println("A familia vai comprar a TV de 50? " + TV50);
		System.out.println("A familia foi tomar sorvete? " + sorvete);
		System.out.println("A familia ficou saldavel? " + saldavel);
	 ///System.out.println("A familia ficou saldavel? " + !sorvete);
		
	}
}
