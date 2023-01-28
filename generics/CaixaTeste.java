package generics;

public class CaixaTeste {
    public static void main(String[] args) {
        Caixa<String> caixaA = new Caixa<>();

        caixaA.guardar("Bizarro");

        System.out.println(caixaA.abrir());


        Caixa<Double> caixaB = new Caixa<>();
        
        caixaB.guardar(777.7);

        System.out.println(caixaB.abrir());
    }
}
