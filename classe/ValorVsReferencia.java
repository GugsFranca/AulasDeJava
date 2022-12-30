package classe;

public class ValorVsReferencia {
	public static void main(String[] args) {
		
		double a = 2;
		double b = a; //atribui��o por valor
		
		a++;
		b--;
		
		System.out.println(a + " " + b);
		
		int c = 5;
		alterarPrimtivo(c);
		System.out.println(c);//tipos primitivos s�o alterados por 
		//valor por isso n�o muda o main
		
		Data d1 = new Data(1 ,6, 2022);
		Data d2 = d1; // Atribui��o por referencia (Objeto)
		
		d1.dia = 23;
		d2.mes = 12;
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		voltarDataParaValorPadrao(d2);
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());

	
	}
	static void voltarDataParaValorPadrao(Data d) {
		d.ano = 1970;
		d.dia = 1;
		d.mes = 1;
	}
	static void alterarPrimtivo(int a) {
		a++;
	}
}
