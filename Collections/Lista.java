package Collections;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {

        ArrayList<Usuario> list = new ArrayList<>();

        Usuario u1 = new Usuario("Maria");
        list.add(u1);

        list.add(new Usuario("Carlos"));
        list.add(new Usuario("Lia"));
        list.add(new Usuario("Bia"));
        list.add(new Usuario("Manu"));
        list.add(new Usuario("Manu"));

        System.out.println(list.get(3));//nome partindo do zero[Maria=0]//índice

        list.remove(1);//Carlos
        System.out.println(">>>>>> " + list.remove(1));
        System.out.println(list.remove(new Usuario("Manu")));
        System.out.println("Tem??? " + list.contains(new Usuario("Bia")));
        System.out.println("Tem ne? " + list.contains(u1));

        for (Usuario u: list){
            System.out.println(u.nome);
        }
    }
}
