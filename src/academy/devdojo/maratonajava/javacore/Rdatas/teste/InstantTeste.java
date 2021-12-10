package academy.devdojo.maratonajava.javacore.Rdatas.teste;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTeste {
    public static void main(String[] args) {
        // Instant é uma hora neutra, onde em qualquer lugar do mundo vai ser a mesma hora
        Instant now = Instant.now();
        System.out.println(LocalDateTime.now());
        System.out.println(now.getEpochSecond());
        System.out.println(now.getNano()); // Número máximo: 999.999.999
        System.out.println(Instant.ofEpochSecond(3,0));
        System.out.println(Instant.ofEpochSecond(3,1_000_000_000));
        System.out.println(Instant.ofEpochSecond(3,-1_000_000_000));

    }
}
