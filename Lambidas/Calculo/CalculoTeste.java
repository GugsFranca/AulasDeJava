package Lambidas.Calculo;

public class CalculoTeste {
    public static void main(String[] args) {
        Calculo soma = new Soma();

        System.out.println(soma.executar(2, 3));

        soma = new Multiplicar();
        System.out.println(soma.executar(2,3));
    }
}
