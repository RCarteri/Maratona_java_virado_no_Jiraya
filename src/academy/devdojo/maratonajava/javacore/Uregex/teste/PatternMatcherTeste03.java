package academy.devdojo.maratonajava.javacore.Uregex.teste;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTeste03 {
    public static void main(String[] args) {
//        \d = Todos os digitos
//        \D = Tudo o que não for dígito
//        \s = Espaços em branco \t \n \f \r
//        \S = Todos os caracteres excluido os brancos
//        \w = a-zA-Z, digitos, _
//        \W = Tudo o que não for incluso no \w
//        [] intervalos
        String regex = "0[xX][\\da-fA-F]";
        String texto = "12sd 0x 0x323D 0X1 0x321d";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto: " + texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex " + regex);
        System.out.println("Posições encontradas");
        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group());
        }
    }
}
