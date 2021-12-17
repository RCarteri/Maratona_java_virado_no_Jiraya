package academy.devdojo.maratonajava.javacore.Ycolecoes.Teste;

import java.util.HashMap;
import java.util.Map;

public class MapTeste {
    public static void main(String[] args) {
        // Para manter a ordem de inserção usar o LinkedHashMap
        HashMap<String, String> map = new HashMap<>();
        map.put("Teklado", "teclado");
        map.put("mouze", "mouse");
        map.put("vc", "você");
        map.putIfAbsent("vc2", "você"); // Adiciona se não existe, se for com o put normal ele vai substituir o valor respectivo a chave passada
        System.out.println(map);

        //Maneiras de imprimir chave e valor separado:
        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }

        System.out.println("---------");
        for (String value : map.values()) {
            System.out.println(value);
        }

        System.out.println("---------");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }


    }
}
