package academy.devdojo.maratonajava.javacore.ZZEstream.teste;

import academy.devdojo.maratonajava.javacore.ZZEstream.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEstream.dominio.LightNovel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTeste12 {
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
        HashMap<Category, List<LightNovel>> categoryListHashMap = new HashMap<>();
        List<LightNovel> fantasy = new ArrayList<>();
        List<LightNovel> drama = new ArrayList<>();
        List<LightNovel> romance = new ArrayList<>();
        for (LightNovel lightNovel : lightNovels) {
            switch (lightNovel.getCategory()){
                case DRAMA: drama.add(lightNovel); break;
                case FANTASY: fantasy.add(lightNovel); break;
                case ROMANCE: romance.add(lightNovel); break;
            }
        }
        categoryListHashMap.put(Category.DRAMA, drama);
        categoryListHashMap.put(Category.FANTASY, fantasy);
        categoryListHashMap.put(Category.ROMANCE, romance);
        System.out.println(categoryListHashMap);

        //Todo o codigo acima pode ser substituido por:
        Map<Category, List<LightNovel>> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory));
        System.out.println(collect);

    }
}
