package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        //Off e add -�? Adicionam elementos na fila
        //Diferenca e o comportamento quando a fila esta cheia!
        fila.add("Anna");    // retorna False
        fila.offer("Bia");// Lanca uma excecao
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Genoveva");
        fila.offer("Rafaela");
        fila.add("Leo");

        //Peek e Element ==> obter o proximo elemento
        // da fila sem remover
        //Diferenca e o comportamento quando a fila este vazia!
        System.out.println(fila.peek());//    retorna false
        System.out.println(fila.peek());
        System.out.println(fila.element());// Lanca uma excecao
        System.out.println(fila.element());



        //Poll e Remove ==> obter o pr�ximo elemento
        // da fila e remove!
        System.out.println(fila.poll());//    retorna false
        System.out.println(fila.remove());// Lan�a uma exce��o
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.remove());

//          fila.size();
////        fila.clear();
////        fila.isEmpty();
////          fila.contains();

    }
}
