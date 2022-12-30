package OO1.composicao.DesafioCompra;

public class ClienteTeste {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Ronaldo");

        Compra c1 = new Compra();
        c1.adicionarProduto("Borracha", 0.50, 10);
        c1.adicionarItem(new Produto("Lapis", 1), 2);

        Compra c2 = new Compra();
        c2.adicionarProduto("Caderno", 15, 2);
        c2.adicionarItem(new Produto("Livro Didatico", 50), 1);

        cliente.compras.add(c1);
        cliente.adicionarCompra(c2);

        System.out.println(cliente.obterValorTotal());

    }
}
