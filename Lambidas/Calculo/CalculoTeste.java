package Lambidas.Calculo;

import Lambidas.Calculo.Multiplicar;
import Lambidas.Calculo.Soma;

public class CalculoTeste {
    public static void main(String[] args) {
        Calculo soma = new Soma();

        System.out.println(soma.executar(2, 3));

        soma = new Multiplicar();
        System.out.println(soma.executar(2,3));
    }
}
