package academy.devdojo.maratonajava.javacore.Ycolecoes.Teste;

import java.util.ArrayList;
import java.util.Collections;

public class ListSortTeste {
    public static void main(String[] args) {
        ArrayList<String> mangas = new ArrayList<>();
        mangas.add("Pokemon");
        mangas.add("Naruto");
        mangas.add("Dragon Ball Z");
        mangas.add("Digimon");
        System.out.println(mangas);
        Collections.sort(mangas);
        System.out.println(mangas);
    }
}
