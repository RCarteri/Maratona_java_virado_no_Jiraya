package academy.devdojo.maratonajava.javacore.Ycolecoes.Teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.Dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.Dominio.Manga;
import java.util.List;

import java.util.HashMap;
import java.util.Map;

public class MapTeste03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Ricardo Carter");
        Consumidor consumidor2 = new Consumidor("DevDojo");

        Manga manga1 = new Manga(5L, "Naruto", 19.9, 0);
        Manga manga2 = new Manga(1L, "Pokemon", 1.9, 1);
        Manga manga3 = new Manga(3L, "Baby", 10.9, 0);
        Manga manga4 = new Manga(2L, "Dragon", 3.9, 8);
        Manga manga5 = new Manga(4L, "Shark", 5.9, 0);
        Manga manga6 = new Manga(4L, "Shark", 5.9, 0);

        List<Manga> mangaConsumidor1List = List.of(manga1, manga2);
        List<Manga> mangaConsumidor2List = List.of(manga5, manga4);
        Map<Consumidor, List<Manga>> consumidorMangaMap = new HashMap<>();
        consumidorMangaMap.put(consumidor1, mangaConsumidor1List);
        consumidorMangaMap.put(consumidor2, mangaConsumidor2List);

        for (Map.Entry<Consumidor, List<Manga>> entry : consumidorMangaMap.entrySet()) {
            System.out.println(entry.getKey().getNome());
            for (Manga manga : entry.getValue()) {
                System.out.println("---" + manga.getNome());
            }

        }


    }
}
