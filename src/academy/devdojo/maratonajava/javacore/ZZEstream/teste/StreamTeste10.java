package academy.devdojo.maratonajava.javacore.ZZEstream.teste;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTeste10 {
    public static void main(String[] args) {
       Stream.iterate(1, n -> n + 2)
               .limit(10)
               .forEach(System.out::println);

       //0,1,1,2,3,5,8,13,21,34
        //(0,1) (1,1) (1,2) (2,3) (3,5) (5,8)
        Stream.iterate(new int[]{0,1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(10)
                .forEach(a -> System.out.println(Arrays.toString(a)));

        Stream.iterate(new int[]{0,1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(10)
                .map(a -> a[0])
                .forEach(System.out::println);
    }
}
