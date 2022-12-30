package Collections;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {

        Map<Integer, String> user = new HashMap<>();

        user.put(1 ,"Richard");
        user.put(4, "Rebeca");
        user.put(20, "Rafaela");
        user.put(2, "Roberto");



        System.out.println(user.size());
        System.out.println(user.isEmpty());

        System.out.println(user.keySet());
        System.out.println(user.values());
        System.out.println(user.entrySet());

        System.out.println(user.containsKey(4));
        System.out.println(user.containsValue("Rebeca"));

        System.out.println(user.get(4));

        for (int chave: user.keySet()){
            System.out.println(chave);
        }
        for (String valor: user.values()){
            System.out.println(valor);
        }
        for (Map.Entry <Integer, String> registro: user.entrySet() ){
            System.out.print(registro.getKey() + " ==>");
            System.out.println(registro.getValue());
        }
    }
}
