package academy.devdojo.maratonajava.javacore.Zgenerics.teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.Dominio.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTeste {
    public static void main(String[] args) {
        // Sem usar o generics <> você não tem garantia de vai falar quando colocar um objeto que não pertence, com o generics ele não deixa passar pois da erro em tempo de execucao
        List<String> lista = new ArrayList<>();
        lista.add("Midorya");
        lista.add("Midorya");

        for (String s : lista) {
            System.out.println(s);
        }
        add(lista, new Consumidor("Midorya"));

        for (Object s : lista) {
            System.out.println(s);
        }
    }
    private static void add(List lista, Consumidor consumidor){
        lista.add(consumidor);
    }
}
