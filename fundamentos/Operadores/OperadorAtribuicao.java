package fundamentos.Operadores;

public class OperadorAtribuicao {
	public static void main(String[] args) {
		
		int a = 3;
		int b = a;
		int c = a + b;
		
		c += b;// c = c + b;
		c -= a;// c = c + a;
		c *= b;// c = c * b;
		c /= a;// c = c / a;
		c %= a;// c = c % a; 0 ou 1
		
		System.out.println(c);
		
		a++;// tem menor precedencia(Ou seja o programa le depois da variavel)
		b--;
		
		--a;// tem maior precedencia(Ou seja o programa le antes da variavel)
		++b;
	}
}
