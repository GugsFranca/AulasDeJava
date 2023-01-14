package streaming;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {
        Consumer<String> print = System.out::print; //O consumer não retorna nada logo posso referenciar
        Consumer<Object> println = System.out::println; //O consumer não retorna nada logo posso referenciar

        System.out.println("\n//Stream.of na propria Stream");
        Stream<String> langs = Stream.of("Java ", "Lua ","JS\n");
        langs.forEach(print);

        String[] maisLangs = {"Phyton ", "Lisp ","Preal ", "Go\n"};


        System.out.println("\n//Stream.of");
        Stream.of(maisLangs).forEach(print);

        System.out.println("\n//Arrays sem contagem");
        Arrays.stream(maisLangs).forEach(print);

        System.out.println("\n//Arrays com contagem");
        Arrays.stream(maisLangs,1,3).forEach(print);

        List<String> outrasLinguas = Arrays.asList("C ", "PHP ", "Kotlin " , "Java \n");

        System.out.println("\n//Stream.forEach");
        outrasLinguas.stream().forEach(print);

        System.out.println("\n//parallelStream.forEach");
        outrasLinguas.parallelStream().forEach(print);

        //Gera "a" de forma infinita !!!CUIDADO!!!
        //Stream.generate(() -> "a").forEach(print); 

        //Soma +1 infinitamente
        //Stream.iterate(0, n -> n + 1).forEach(println);

    }
}
