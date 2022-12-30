package OO1.composicao.Compras;

public class CompraTeste {
    public static void main(String[] args) {

        Compra c1 = new Compra();
        c1.cliente = "Carlos";
        c1.itens.add(new Item("Borracha", 12, 0.50));
        c1.itens.add(new Item("Lapis", 10, 1.50));
        c1.itens.add(new Item("Apontador", 3, 0.25));

        System.out.println("total: " + c1.getValorTotal());
    }
}
