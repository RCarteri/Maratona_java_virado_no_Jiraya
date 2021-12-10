package academy.devdojo.maratonajava.javacore.Uregex.teste;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTeste05 {
    public static void main(String[] args) {
//        \d = Todos os digitos
//        \D = Tudo o que não for dígito
//        \s = Espaços em branco \t \n \f \r
//        \S = Todos os caracteres excluido os brancos
//        \w = a-zA-Z, digitos, _
//        \W = Tudo o que não for incluso no \w
//        [] intervalos
//        ? Zero ou uma
//        * Zero ou mais
//        + uma ou mais
//        {n,m} de n até m
//        () agrupamento
//        | ou o(c|v)o - vai retornar ovo ou oco
//        $ fim da linha
//        . 1.3 = 123, 133, 1#3, 1A3 - qualquer valor entre 1 e 3
        String regex = "([a-zA-Z\\d\\.])+@[a-zA-Z]+(\\.[a-zA-Z]+)+";
        String texto = "luffy@hotmail.com, 123jotaro@gmail.com, !@#zoro@mail.com, teste@gmail.com.br, r@r.com, sakura@mail";
        System.out.println("Email válido");
        System.out.println("!@#zoro@mail.br".matches(regex));
        System.out.println(texto.split(",")[1].trim());
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
