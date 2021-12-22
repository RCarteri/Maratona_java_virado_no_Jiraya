package academy.devdojo.maratonajava.javacore.ZZEstream.teste;

import academy.devdojo.maratonajava.javacore.ZZEstream.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTeste08 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei", 8.99),
            new LightNovel("Overload", 3.99),
            new LightNovel("Violet", 5.99),
            new LightNovel("No Game no Life", 2.99),
            new LightNovel("Fullmetal Alchemist", 5.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Monitagari", 2.99)
    ));
    public static void main(String[] args) {
       lightNovels.stream()
               .map(LightNovel::getPrice)
               .filter(price -> price > 3)
               .reduce(Double::sum)
               .ifPresent(System.out::println);

       //Trabalhando com tipo primitivo sem fazer boxing/unboxing
        double sum = lightNovels.stream()
                .mapToDouble(LightNovel::getPrice)
                .filter(price -> price > 3)
                .sum();

        System.out.println(sum);
    }
}
