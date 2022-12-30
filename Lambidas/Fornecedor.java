package Lambidas;


import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
    public static void main(String[] args) {
        Supplier< List<String> > umLista = () -> Arrays.asList("Ana","Bia", "Lia", "Gui");

        Supplier<Object> lista2 = () -> Arrays.asList("JOrge", "Jão", "Jose");

        System.out.println(umLista.get());
        System.out.println(lista2.get());

    }
}
