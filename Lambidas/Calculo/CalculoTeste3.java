package Lambidas.Calculo;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
    public static void main(String[] args) {

        // Nao pode int==>Double
        //double ==> Double pode

        BinaryOperator<Double> calc = (x, y) ->{return x + y;};//recebe 2 valores do mesmo tipo
        System.out.println(calc.apply(2.0,3.0));

        calc = (x , y) -> x * y;
        System.out.println(calc.apply(2.0, 3.0));

        BinaryOperator<Integer> calc2 = (x, y) -> x + y;;
        System.out.println(calc2.apply(2, 3));
    }
}
