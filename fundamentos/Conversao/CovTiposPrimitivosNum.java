package fundamentos.Conversao;

public class CovTiposPrimitivosNum {
	public static void main(String[] args) {
		
		double a = 1; // Conversao implicita
		System.out.println(a);
		
		float b = (float) 1.2948295025902; //Explicito (CAST) com perda de informacao
		System.out.println(b);
		
		int c = 140;
		byte d = (byte) c; //explicito(CAST)(quando passas de 127 o byte roda ao contrario)
		System.out.println(d);
		
		double e = 4_378_585_899_9.9;
		int f = (int) e;
		System.out.println(f);
		
		float g = 3.0F;
		int h = (int) g; //Explicito(CAST) sem perdas
		System.out.println(h);
	}

}
