package classe;

public class dataTeste {
	public static void main(String[] args) {
		Data data = new Data();
		
		System.out.println(data.obterDataFormatada());
		
		var data2 = new Data(7, 10, 2032);
				
		String dataFormatada = data2.obterDataFormatada();
		
		System.out.print(dataFormatada);
	}
}
