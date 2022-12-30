package OO1.composicao.DesafioCompra;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    final List<Item> itens = new ArrayList<>();

    void adicionarItem(Produto produto, int quatidade){
        this.itens.add(new Item(produto, quatidade));
    }

    void adicionarProduto(String nome, double preco, int quatidade){
        this.itens.add(new Item(new Produto(nome, preco), quatidade));
    }

    double obterValorTotal(){
        double total = 0;
        for (Item item: itens) {
            total += item.produto.preco * item.quant;
        }
        return  total;
    }

}
