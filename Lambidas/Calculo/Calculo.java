package Lambidas.Calculo;

@FunctionalInterface
public interface Calculo {

        double executar(double a, double b);

        default String legal(){
                return "Legal";
        }
        static String demais(){
                return "Demais";
        }

}
