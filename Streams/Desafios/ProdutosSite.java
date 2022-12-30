package Streams.Desafios;

public class ProdutosSite {
    final String nome;
    final double preco;
    final int desconto;
    final boolean frete;

    public ProdutosSite(String nome, double preco, int desconto, boolean frete){
        this.nome = nome;
        this.preco  = preco;
        this.desconto = desconto;
        this.frete = frete;
    }
    public double valorReal(double preco, int desconto){

        return (preco * desconto)/100;
     
    }

}
