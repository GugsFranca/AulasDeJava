package fundamentos.Desafio;

public class Temperatura {
	public static void main(String[] args) {
		// ( F - 32) x 5/9 = C
		final int coisa = 32;
		final double fator = 5/9.0;
		
		int F = 75;
		double C = (F - coisa) * fator;
		
		System.out.println("O resultado é " + C + "ºC");	
	}
}
