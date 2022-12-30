package classe;

public class PrimeiroTrauma {
	
	int a = 3;
	static int b = 5;
	public static void main(String[] args) {
		
		PrimeiroTrauma t = new PrimeiroTrauma();
		
		System.out.println(t.a);//classe statica não pode acessar uma instacia
		System.out.println(b);//classe statica conversa com staticos
	}
}
