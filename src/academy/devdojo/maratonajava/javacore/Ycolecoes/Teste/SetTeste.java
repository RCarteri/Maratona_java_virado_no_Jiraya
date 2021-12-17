package academy.devdojo.maratonajava.javacore.Ycolecoes.Teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.Dominio.Manga;

import java.util.HashSet;
import java.util.Set;

public class SetTeste {
    public static void main(String[] args) {
        // Set não permite alores duplicados, baseando-se no equals que foi sobrescrito
        // HashSet usa um hash para ordenação entao a ordem de insersão não é a mesma que vai aparecer, para isso usa-se o LinkedHashSet<>
        Set<Manga> mangas = new HashSet<>();
        mangas.add(new Manga(5L, "Naruto", 19.9, 0));
        mangas.add(new Manga(1L, "Pokemon", 1.9, 1));
        mangas.add(new Manga(3L, "Baby", 10.9, 0));
        mangas.add(new Manga(2L, "Dragon", 3.9, 8));
        mangas.add(new Manga(4L, "Shark", 5.9, 0));
        mangas.add(new Manga(4L, "Shark", 5.9, 0)); // Não vai ser salvo

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }
}
