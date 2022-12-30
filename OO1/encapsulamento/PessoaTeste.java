package OO1.encapsulamento;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("ronaldo", -35);

        p1.setIdade(200);//Valor invalido

        System.out.println(p1);
    }
}
