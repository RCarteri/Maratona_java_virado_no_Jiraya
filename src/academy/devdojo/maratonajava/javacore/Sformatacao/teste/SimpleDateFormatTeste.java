package academy.devdojo.maratonajava.javacore.Sformatacao.teste;

import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class SimpleDateFormatTeste {
    public static void main(String[] args) {
       String pattern = "'Brasil' dd 'de' MMMM 'de' yyyy";
       SimpleDateFormat sdf = new SimpleDateFormat(pattern);
       System.out.println(sdf.format(new Date()));
        try {
            System.out.println(sdf.parse("Brasil 09 de dezembro de 2021"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
