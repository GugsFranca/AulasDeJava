package Streams.Desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class DesafioFiltro {
    public static void main(String[] args) {
        Cavalo cavalo1 = new Cavalo("Calvareto", 100, true, false);
        Cavalo cavalo2 = new Cavalo("Ultraman" , 50 , true, true);
        Cavalo cavalo3 = new Cavalo("Bollywoodboy", 90, false, false);
        Cavalo cavalo4 = new Cavalo("Chinatown", 30, false, true);
        Cavalo cavalo5 = new Cavalo("Dimitri", 150, true, true);
        Cavalo cavalo6 = new Cavalo("Sr.Cenoura", 80, true, true);

        List<Cavalo> competidores =  Arrays.asList(cavalo1,cavalo2,cavalo3,cavalo4,cavalo5,cavalo6);
        Predicate<Cavalo> estaSaudavel = s -> s.saudavel;
        Predicate<Cavalo> alguemMonta = m -> m.temCavaleiro;
        Predicate<Cavalo> altura = a -> a.alturaDeSalto >= 60;
        Function<Cavalo, String> passou = c -> "O Cavalo " + c.nome + " passou para a prova";

        competidores.stream().
        filter(estaSaudavel)
        .filter(alguemMonta)
        .filter(altura)
        .map(passou)
        .forEach(System.out::println);

    }
}
