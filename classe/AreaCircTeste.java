package classe;

public class AreaCircTeste {
	public static void main(String[] args) {
		AreaCirc a1 = new AreaCirc(10);
		a1.raio = 100;
		//a1.PI = 100;
		
		//AreaCirc.PI = 3.1415;
		
		System.out.println(a1.area());
		System.out.println(AreaCirc.area(8));
		System.out.println(AreaCirc.PI);
		System.out.println(Math.PI);
		// Posso fazer isso mas não é o correto
		//System.out.println(a1.PI);

	}
}
