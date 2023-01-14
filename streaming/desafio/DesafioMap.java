package streaming.desafio;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
    public static void main(String[] args) {

        Consumer<Object> printar = System.out::println;
        
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
        
        UnaryOperator<String> inversor = i -> new StringBuilder(i).reverse().toString();

        Function<String, Integer> normal = n -> Integer.parseInt(n, 2); 
        //Utilizado o 2 o parse int intende que é um valor binário para ser convertido em inteiro
        
        nums.stream().map(Integer::toBinaryString).map(inversor).map(normal).forEach(printar);;

    }
}
