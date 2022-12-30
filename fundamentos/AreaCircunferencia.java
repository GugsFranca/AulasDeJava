package fundamentos;

public class AreaCircunferencia {
	public static void main(String[] args) {
		
		int raio = 3; //int inteiro
		//double trovao = 3.4;
		final double pi = 3.14; //a variavel nunca mais vai mudar
		
		double area = pi * raio * raio;
		
//		System.out.println(pi * raio * raio);
		System.out.println(area);
		
		raio = 10;
		area = pi * raio * raio;
		System.out.println("Área = " + area + " m2." );
	}
}
