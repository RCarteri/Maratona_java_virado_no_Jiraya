package academy.devdojo.maratonajava.javacore.Rdatas.teste;

import java.util.Date;

public class DateTeste {
    public static void main(String[] args) {
        Date date = new Date();
        date.setTime(date.getTime() + 3_600_000);
        System.out.println(date);
    }
}