package academy.devdojo.maratonajava.javacore.Ycolecoes.Teste;


import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTeste {
    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>();
        map.put("A", "Letra A");
        map.put("D", "Letra D");
        map.put("B", "Letra B");
        map.put("C", "Letra C");
        map.put("E", "Letra E");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
//        lower <
//        floor <=
//        higher >
//        ceiling >=
        System.out.println(map.headMap("C", true)); // Retorna todos os menores incluindo o argumento passado
        System.out.println(map.ceilingKey("C"));
        System.out.println(map.higherKey("C"));
        System.out.println(map.floorKey("C"));
        System.out.println(map.lowerKey("C"));
    }
}
