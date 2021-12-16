package academy.devdojo.maratonajava.javacore.Ycolecoes.Teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.Dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MangaSortteste02 {
    public static void main(String[] args) {
        MangaByIdComparator mangaByIdComparator = new MangaByIdComparator();
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(5L, "Naruto", 19.9));
        mangas.add(new Manga(1L, "Pokemon", 1.9));
        mangas.add(new Manga(3L, "Baby", 10.9));
        mangas.add(new Manga(2L, "Dragon", 3.9));
        mangas.add(new Manga(4L, "Shark", 5.9));

        Collections.sort(mangas);
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga mangaToSearch = new Manga(2L, "Dragon", 3.9);
        Manga mangaError = new Manga(10L, "Tri", 3.9);
        System.out.println(Collections.binarySearch(mangas, mangaToSearch));

        //Se usou o Comparator para ordenar precisa passar ele como argumento:
        mangas.sort(mangaByIdComparator);
        System.out.println(Collections.binarySearch(mangas, mangaToSearch, mangaByIdComparator));
        System.out.println(Collections.binarySearch(mangas, mangaError, mangaByIdComparator));


    }
}
