package Streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Lu","Ana","Bia","Luca");
        
        System.out.println("//Foreach Classico");
        for (String string : aprovados) {
            System.out.println(string);
        }

        System.out.println("//Foreach");
        aprovados.forEach(System.out::println);
    
        System.out.println("//Iterator");
        Iterator<String> it = aprovados.iterator();

        while(it.hasNext()){//hasNext é uma função que retorna true sempre que tem algo a mais na lista
            System.out.println(it.next());//next te envia o proximo item da lista
        }
        System.out.println("\n//StreamApi");
        Stream<String> st = aprovados.stream();
        st.forEach(System.out::println);
    }
}

