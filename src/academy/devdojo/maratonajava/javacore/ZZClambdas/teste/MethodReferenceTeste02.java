package academy.devdojo.maratonajava.javacore.ZZClambdas.teste;

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

//Reference to an instance method of a particular object
public class MethodReferenceTeste02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Bersek", 43), new Anime("One piece", 100), new Anime("Naruto", 500)));
        animeList.sort(animeComparators::compareByEpisodesNonStatic);
        //Sem method reference
        animeList.sort((a1, a2) -> animeComparators.compareByEpisodesNonStatic(a1,a2));
        System.out.println(animeList);
    }
}
