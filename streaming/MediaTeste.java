package streaming;

public class MediaTeste {
    public static void main(String[] args) {

        Media m1 = new Media().adcionar(6.7).adcionar(8.3);

        System.out.println(m1.getValor());
    }
}
