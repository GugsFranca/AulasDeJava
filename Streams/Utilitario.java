package Streams;

import java.util.function.UnaryOperator;

public interface Utilitario {
        
       public static final UnaryOperator<String> maiuscula 
       = n -> n.toUpperCase();

       public static final UnaryOperator<String> primeiraLetra 
       = n -> n.charAt(0) + "";

       public static String grito(String n) {
             return n + "!!!!!! ";}
    }
