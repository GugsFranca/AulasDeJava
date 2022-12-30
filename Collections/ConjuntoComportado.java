package Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {

//      Set<String> lista = new HashSet<>();
        SortedSet<String> lista = new TreeSet<>();
        lista.add("Surprise");
        lista.add("Ana");
        lista.add("Carlos");
        lista.add("Luis");

        System.out.println(lista);

        for(String candidato: lista){
            System.out.println(candidato);
        }

        Set<Integer> nums = new HashSet<>();//não aceita tipos primitivos
        nums.add(23);
        nums.add(31);
        nums.add(58);
        nums.add(17);

        System.out.println(nums);

        for(int numeros: nums){
            System.out.println(numeros);
        }

    }
}
