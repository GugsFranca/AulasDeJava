package Lambidas;

import Lambidas.Calculo.Calculo;

public class Soma implements Calculo {
    @Override
    public double executar(double a, double b) {
        return a + b;
    }
}
