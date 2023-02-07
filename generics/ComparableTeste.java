package generics;

import java.util.TreeSet;

public class ComparableTeste {
    public static void main(String[] args) {
        TreeSet<Integer> nums = new TreeSet<>();//TreeSet implementa o Comparable, 
                                                //ou seja organiza do maior para o maior e remove os iguais
        nums.add(1);
        nums.add(2);
        nums.add(30);
        nums.add(4);
        nums.add(65);
        nums.add(6);
        nums.add(7);
        nums.add(-331);
        nums.add(123);
        nums.add(123);
        for (Integer n : nums) {
            System.out.println(n);
        }
    }    
}