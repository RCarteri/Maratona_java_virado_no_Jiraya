package academy.devdojo.maratonajava.javacore.Uregex.teste;

import kotlin._Assertions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTeste02 {
    public static void main(String[] args) {
//        \d = Todos os digitos
//        \D = Tudo o que não for dígito
//        \s = Espaços em branco \t \n \f \r
//        \S = Todos os caracteres excluido os brancos
//        \w = a-zA-Z, digitos, _
//        \W = Tudo o que não for incluso no \w
        String regex = "\\w";
        String texto = "@#sf23_sdf 134fdw";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto: " + texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex " + regex);
        System.out.println("Posições encontradas");
        while (matcher.find()){
            System.out.println(matcher.start() + " " + matcher.group());
        }
    }
}
