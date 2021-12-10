package academy.devdojo.maratonajava.javacore.Sformatacao.teste;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormatTeste {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        DateFormat[] df = new DateFormat[7];
        df[0] = DateFormat.getInstance();
        df[1] = DateFormat.getDateInstance();
        df[2] = DateFormat.getTimeInstance();
        df[3] = DateFormat.getDateInstance(DateFormat.SHORT);
        df[3] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        df[3] = DateFormat.getDateInstance(DateFormat.LONG);
        df[3] = DateFormat.getDateInstance(DateFormat.FULL);

        for (DateFormat dateFormat: df){
            System.out.println(dateFormat.format(calendar.getTime()));
        }
    }
}
