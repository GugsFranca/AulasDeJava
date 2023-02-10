package padroes.observer;

public class Namorada implements ObservadorChegadaAniversariante{

    public void chegou(EventoChegadaAniversariante envento) {
        System.out.println("Avisar a todos...");
        System.out.println("Apagar as luzes...");
        System.out.println("Esperar um pouco...");
        System.out.println("e... Surpresa!!!!");
        
    }
}
