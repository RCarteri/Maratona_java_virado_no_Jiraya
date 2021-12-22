package academy.devdojo.maratonajava.javacore.ZZEstream.teste;

import academy.devdojo.maratonajava.javacore.ZZEstream.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEstream.dominio.LightNovel;
import academy.devdojo.maratonajava.javacore.ZZEstream.dominio.Promotion;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

import static academy.devdojo.maratonajava.javacore.ZZEstream.dominio.Promotion.NORMAL_PRICE;
import static java.util.stream.Collectors.*;

public class StreamTeste15 {
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
        Map<Category, DoubleSummaryStatistics> collect = lightNovels.stream()
                .collect(groupingBy(LightNovel::getCategory, summarizingDouble(LightNovel::getPrice)));
        System.out.println(collect);

        Map<Category, Set<Object>> collect1 = lightNovels.stream()
                .collect(groupingBy(LightNovel::getCategory, mapping(StreamTeste15::getPromotion, toSet())));
        System.out.println(collect1);

        Map<Category, LinkedHashSet<Promotion>> collect2 = lightNovels.stream()
                .collect(groupingBy(LightNovel::getCategory, mapping(StreamTeste15::getPromotion,
                        toCollection(LinkedHashSet::new))));
        System.out.println(collect2);

    }
    private static Promotion getPromotion(LightNovel ln){
        return ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : NORMAL_PRICE;
    }
}
