package Collections;

import java.util.HashSet;

@SuppressWarnings("ALL") // bloqueia os avisos amarelos
public class ConjuntoBaguncado {
    public static void main(String[] args) {

        HashSet<Object> conjunto = new HashSet<>();

        conjunto.add(1.2); //double -> Double
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('x');

        System.out.println("Tamanho e: " + conjunto.size());

        System.out.println(conjunto.remove('x'));
        System.out.println(conjunto.remove("Teste"));

        System.out.println("Tamanho e: " + conjunto.size());

        System.out.println(conjunto.contains('x'));
        System.out.println(conjunto.contains(1));

        HashSet<Object> nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        //conjunto.addAll(nums); //Uni�o entre dois conjuntos
        //System.out.println(conjunto);

        conjunto.retainAll(nums);
        System.out.println(conjunto);

        conjunto.clear();
        System.out.println(conjunto);



    }
}
