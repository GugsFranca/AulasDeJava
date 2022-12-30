package classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		
	  //Scanner entrada = new Scanner(System.in);
		var p1 = new Produto("Notebook", 4583.98, 12);

		var p2 = new Produto();
		p2.setNome("Caneta Preta");
		p2.setPreco(12.89);
		Produto.setDesconto(0.50);
		
		System.out.println(p1.getNome() + " " + p1.precoComDesconto());
		System.out.println(p2.getNome() + " " + p2.precoComDesconto());
		
		double precoFinal = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto(0.5);
		double mediaCarrinho = (precoFinal + precoFinal2) / 2;
		
		System.out.printf("Media do carrinho = R$%.2f", mediaCarrinho);
	}
}
