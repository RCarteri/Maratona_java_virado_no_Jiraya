package academy.devdojo.maratonajava.javacore.Ycolecoes.Teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.Dominio.Manga;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Caso queira modificar a ordenação pode-se usar o Comparator
class MangaByIdComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}

public class MangaSortTeste {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(5L, "Naruto", 19.9));
        mangas.add(new Manga(1L, "Pokemon", 1.9));
        mangas.add(new Manga(3L, "Baby", 10.9));
        mangas.add(new Manga(2L, "Dragon", 3.9));
        mangas.add(new Manga(4L, "Shark", 5.9));
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Collections.sort(mangas);
        System.out.println("----------");

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("------------");
//        Collections.sort(mangas, new MangaByIdComparator()); pode ser tbm:
        mangas.sort(new MangaByIdComparator());
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
