package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {
    public static void main(String[] args) {
        List <String> langs = Arrays.asList("JS", "PHP", "Java", "C++");
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6);

        String ultimaLinguagem = (String) ListaUtil.getUltimo2(langs);
        Integer ultimoNumero = (Integer) ListaUtil.getUltimo2(nums);

        System.out.println(ultimoNumero +" "+ ultimaLinguagem);


        String ultimaLinguagem1 =  ListaUtil.getUltimo2(langs);
        Integer ultimoNumero1 =  ListaUtil.<Integer>getUltimo2(nums);

        System.out.println(ultimoNumero1 +" "+ ultimaLinguagem1);
    }
}
