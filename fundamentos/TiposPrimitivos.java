package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		//tipos num�ricos inteiros
		byte a = 23;
		short b = 542;
		int c = 56789;
		long d = 3_232_232_342L; //O long precisa de um L(l) no fim do numero se n�o o java acha que � um int
		
		//tipos num�ricos reais 
		float e = 11_445.44F;//Assim como o long o float precisa de um F(f) pois o double � o padr�o do Java
		double f = 2_991_722_234.07;
		
		// Tipo booleano
		boolean g = true; //false
		
		//Tipo caractere
		char h = 'f';//N�o pode usar aspas duplas
		
		//S� para n�o ficar com erro
		System.out.println(a * 365);
		System.out.println(b /2);
		System.out.println(c / d);
		System.out.println( e * f);
		System.out.println(g);
		System.out.println(h);
	}
		
}
