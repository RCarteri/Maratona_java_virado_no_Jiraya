package academy.devdojo.maratonajava.javacore.ZZEstream.teste;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

//flatMap() é usado para retirar uma coleção ou atributo de dentro de outro lugar, quando estão aninhados
public class StreamTeste04 {
    public static void main(String[] args) {
        List<List<String>> devdojo = new ArrayList<>();
        List<String> graphicDesigners = List.of("Wildney", "Catarina", "Sandy");
        List<String> developers = List.of("William", "David", "Harrison");
        List<String> students = List.of("Gustavo", "Guilherme", "Dante");
        devdojo.add(graphicDesigners);
        devdojo.add(developers);
        devdojo.add(students);

        for (List<String> people : devdojo) {
            for (String person : people) {
                System.out.println(person);
            }
        }
        System.out.println("---------");
        devdojo.stream().flatMap(Collection::stream).forEach(System.out::println);
    }
}
