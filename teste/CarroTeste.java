package teste;

public class CarroTeste {
    public static void main(String[] args) {
        Civic civic = new Civic(90);
        Ferrari ferrari = new Ferrari(200);



        ferrari.acelerar();
        ferrari.acelerar();
        civic.acelerar();

        System.out.println(ferrari);

    }

}
