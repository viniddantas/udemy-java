package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<Integer, String>();

        usuarios.put(1,"Vinicius");
        usuarios.put(2,"Vinicius");

//        usuarios.keySet();
//        usuarios.values();
//        usuarios.entrySet();
//
//        usuarios.containsKey();
//        usuarios.containsValue();

        for(Entry<Integer, String> registro: usuarios.entrySet()) {
            System.out.println(registro.getKey());
            System.out.println(registro.getValue());
        }
    }
}
