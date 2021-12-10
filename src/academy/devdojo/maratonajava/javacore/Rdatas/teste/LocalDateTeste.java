package academy.devdojo.maratonajava.javacore.Rdatas.teste;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class LocalDateTeste {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());
        System.out.println(Month.JANUARY.getValue());
        LocalDate date = LocalDate.of(2022,Month.AUGUST,21);
        LocalDate agora = LocalDate.now();
        agora = agora.plusWeeks(4);
        System.out.println("Ano " + date.getYear());
        System.out.println("Mês " + date.getMonth());
        System.out.println("Número do mês" + date.getMonthValue());
        System.out.println("Dia da semana " + date.getDayOfWeek());
        System.out.println("Dia do mês" + date.getDayOfMonth());
        System.out.println("Tamanho do mês " + date.lengthOfMonth());
        System.out.println("É ano bisexto? " + date.isLeapYear());
        System.out.println("Ano " + date.get(ChronoField.YEAR));
        System.out.println("Dia do mês " + date.get(ChronoField.DAY_OF_MONTH));
        System.out.println(date);
















    }
}
