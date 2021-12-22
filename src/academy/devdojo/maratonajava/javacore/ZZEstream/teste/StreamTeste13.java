package academy.devdojo.maratonajava.javacore.ZZEstream.teste;

import academy.devdojo.maratonajava.javacore.ZZEstream.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEstream.dominio.LightNovel;
import academy.devdojo.maratonajava.javacore.ZZEstream.dominio.Promotion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static academy.devdojo.maratonajava.javacore.ZZEstream.dominio.Promotion.*;
import static java.util.stream.Collectors.groupingBy;

public class StreamTeste13 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei", 8.99, Category.FANTASY),
            new LightNovel("Overload", 3.99, Category.DRAMA),
            new LightNovel("Violet", 5.99, Category.ROMANCE),
            new LightNovel("No Game no Life", 2.99, Category.FANTASY),
            new LightNovel("Fullmetal Alchemist", 5.99, Category.ROMANCE),
            new LightNovel("Kumo desuga", 1.99, Category.DRAMA),
            new LightNovel("Monitagari", 2.99, Category.FANTASY)
    ));
    public static void main(String[] args) {
       Map<Promotion, List<LightNovel>> collect = lightNovels.stream()
               .collect(groupingBy(ln -> ln.getPrice() < 6 ? UNDER_PROMOTION : NORMAL_PRICE));
       System.out.println(collect);

        Map<Category, Map<Promotion, List<LightNovel>>> collect1 = lightNovels.stream()
                .collect(groupingBy(LightNovel::getCategory, groupingBy(ln -> ln.getPrice() < 6 ? UNDER_PROMOTION : NORMAL_PRICE)));

        System.out.println(collect1);
    }
}
