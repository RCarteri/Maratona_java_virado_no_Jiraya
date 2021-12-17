package academy.devdojo.maratonajava.javacore.Ycolecoes.Teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.Dominio.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTeste02 {
    public static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(new MangaPrecoComparator().reversed());
        mangas.add(new Manga(5L, "Naruto", 19.9, 0));
        mangas.add(new Manga(1L, "Pokemon", 1.9, 1));
        mangas.add(new Manga(3L, "Baby", 10.9, 0));
        mangas.add(new Manga(2L, "Dragon", 3.9, 8));
        mangas.add(new Manga(4L, "Shark", 5.9, 0));

        while (!mangas.isEmpty()){
            System.out.println(mangas.poll());
        }
    }
}
