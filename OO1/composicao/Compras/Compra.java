package OO1.composicao.Compras;

import java.util.ArrayList;

public class Compra {
    String cliente;
    ArrayList<Item> itens = new ArrayList<>();

    double getValorTotal(){
        double total = 0;
        for (Item itens : itens){
            total += itens.quatidade * itens.preco;
        }

        return total;
    }
}
