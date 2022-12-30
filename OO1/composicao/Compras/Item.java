package OO1.composicao.Compras;

public class Item {
    String nome;
    int quatidade;
    double preco;


    public Item(String nome, int quantidade, double preco) {
        this.preco = preco;
        this.nome = nome;
        this.quatidade = quantidade;
    }
}
