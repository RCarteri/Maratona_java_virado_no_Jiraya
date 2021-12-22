package academy.devdojo.maratonajava.javacore.ZZEstream.teste;

import academy.devdojo.maratonajava.javacore.ZZEstream.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTeste07 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5);

        integers.stream().reduce((x, y) -> x + y).ifPresent(System.out::println);
        System.out.println(integers.stream().reduce(0, (x, y) -> x + y));

        integers.stream().reduce(Integer::sum).ifPresent(System.out::println);
        System.out.println(integers.stream().reduce(0, Integer::sum));

        System.out.println("--------");

        integers.stream().reduce((x, y) -> x * y).ifPresent(System.out::println);
        System.out.println(integers.stream().reduce(1, (x, y) -> x * y));

        System.out.println("--------");

        integers.stream().reduce((x, y) -> x > y ? x : y).ifPresent(System.out::println);
        System.out.println(integers.stream().reduce(0, Integer::max));
    }
}
