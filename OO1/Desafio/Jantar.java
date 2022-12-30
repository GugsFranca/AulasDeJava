package OO1.Desafio;

public class Jantar {
    public static void main(String[] args) {

        Pessoa convidado = new Pessoa(99.65);

        Arroz ing1 = new Arroz(0.2);
        Feijao ing2 = new Feijao(0.1);
        Sorvete sobremesa = new Sorvete(0.4);

        System.out.println(convidado.getPeso());

        convidado.comer(ing1);
        convidado.comer(ing2);
        System.out.println(convidado.getPeso());

        convidado.comer(sobremesa);

        System.out.println(convidado.getPeso());
    }
}
