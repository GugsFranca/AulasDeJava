package generics.caixaComHeranca;

public class CaixaNumeroTeste {
    public static void main(String[] args) {
        CaixaNumero<Double> caixaA = new CaixaNumero<>();
        caixaA.guardar(2.0);
        Double coisaA = caixaA.abrir();
        System.out.println(coisaA);

        CaixaNumero<Integer> caixaB = new CaixaNumero<>();
        caixaB.guardar(20);
        Integer coisaB = caixaB.abrir();
        System.out.println(coisaB);
    }
    
}
