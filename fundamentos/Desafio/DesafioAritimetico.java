package fundamentos.Desafio;

public class DesafioAritimetico {
	public static void main(String[] args) {
		//([6*(3+2)]^2 - ([1-5] * [2-7])^2)^3
		   ///3*2			(2)^3
					//10^3
		int a = 6 * (3 + 2);//int a = Math.pow(6*(3 + 2), 2);
		int a2 = (int) Math.pow(a, 2);
		
		int b = 3*2;
		int ab = a2 / b;
		
		System.out.println(ab);
		
		int c = (1 - 5) * (2-7);
		int c2 = 2;
		int cc = c / c2;
		
		int ccc = (int) Math.pow(cc, 2);
		
		System.out.println(ccc);
		
		int abc = ab - ccc;
		
		int abcpow = (int) Math.pow(abc, 3);
		int divizao = (int) Math.pow(10, 3);
		
		int resolucao = abcpow / divizao;
		
		System.out.println(resolucao);
		
	

		
	}
}
