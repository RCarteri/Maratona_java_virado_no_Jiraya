package academy.devdojo.maratonajava.javacore.Ycolecoes.Teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.Dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.Dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTeste02 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Ricardo Carter");
        Consumidor consumidor2 = new Consumidor("DevDojo");

        Manga manga1 = new Manga(5L, "Naruto", 19.9, 0);
        Manga manga2 = new Manga(1L, "Pokemon", 1.9, 1);
        Manga manga3 = new Manga(3L, "Baby", 10.9, 0);
        Manga manga4 = new Manga(2L, "Dragon", 3.9, 8);
        Manga manga5 = new Manga(4L, "Shark", 5.9, 0);
        Manga manga6 = new Manga(4L, "Shark", 5.9, 0);

        HashMap<Consumidor, Manga> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor1, manga1);
        consumidorManga.put(consumidor2, manga4);
        for (Map.Entry<Consumidor, Manga> entry : consumidorManga.entrySet()) {
            System.out.println(entry.getKey().getNome() + " - " + entry.getValue().getNome());
        }

    }
}
