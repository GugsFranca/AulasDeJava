package Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {

        Deque<String> livro = new ArrayDeque<String>();

        livro.push("O pequeno principe");
        livro.push("Don Quixote");
        livro.push("O Hobbit");
        livro.push("Harry Potter");
        livro.push("The witcher");
        livro.add("A lenda de fogo e gelo");

        System.out.println(livro.peek());
        System.out.println(livro.element());

        for (String livros: livro) {
            System.out.println(">" + livros);
        }

        System.out.println(livro.pop());
        System.out.println(livro.poll());
        System.out.println(livro.poll());
        System.out.println(livro.remove());

//        livro.size();
//        livro.contains();
//        livro.clear();
//        livro.isEmpty();


    }
}
