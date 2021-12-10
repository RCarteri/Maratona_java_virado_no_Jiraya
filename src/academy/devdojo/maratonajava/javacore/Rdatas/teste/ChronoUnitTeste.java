package academy.devdojo.maratonajava.javacore.Rdatas.teste;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTeste {
    public static void main(String[] args) {
        LocalDateTime aniversario = LocalDateTime.of(1996,4,4,8,45,0);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(ChronoUnit.DAYS.between(aniversario,now));
        System.out.println(ChronoUnit.WEEKS.between(aniversario,now));
        System.out.println(ChronoUnit.MONTHS.between(aniversario,now));
        System.out.println(ChronoUnit.MINUTES.between(aniversario,now));

    }
}
