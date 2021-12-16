package academy.devdojo.maratonajava.javacore.Ycolecoes.Teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.Dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTeste {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(5L, "Naruto", 19.9, 0));
        mangas.add(new Manga(1L, "Pokemon", 1.9, 1));
        mangas.add(new Manga(3L, "Baby", 10.9, 0));
        mangas.add(new Manga(2L, "Dragon", 3.9, 8));
        mangas.add(new Manga(4L, "Shark", 5.9, 0));

        // Maneira imperativa de fazer
//        Iterator<Manga> mangaIterator = mangas.iterator();
//        while(mangaIterator.hasNext()){
//            if (mangaIterator.next().getQuantidade() == 0){
//                mangaIterator.remove();
//            }
//        }
        // Maneira funcional, utilizando programação funcional
        mangas.removeIf(manga -> manga.getQuantidade() == 0);
        System.out.println(mangas);
    }
}
