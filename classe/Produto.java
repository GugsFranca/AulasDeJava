package classe;

public class Produto {

	public String nome;
	public  double preco;
	public static double desconto;

	Produto() {

	}

	public Produto(String nomeInicial, double precoInicial, double descontoInicial) {
		this.nome = nomeInicial;
		this.setPreco(precoInicial);
		desconto = descontoInicial;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public static double getDesconto() {
		return desconto;
	}

	public static void setDesconto(double desconto) {
		Produto.desconto = desconto;
	}

	double precoComDesconto() {

		double precoFinal = getPreco() * (1 - desconto);

		return precoFinal;
	}

	double precoComDesconto(double descontoDoGerente) {

		return getPreco() * (1 - desconto + descontoDoGerente);
	}

}
