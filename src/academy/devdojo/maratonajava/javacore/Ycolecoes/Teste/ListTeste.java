package academy.devdojo.maratonajava.javacore.Ycolecoes.Teste;

import java.util.ArrayList;

public class ListTeste {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>(); // A partr da versão 1.5 precisa diser de que é a lista
        ArrayList<String> nomes2 = new ArrayList<>();
        nomes.add("Ricardo");
        nomes.add("Fernando");
        nomes2.add("Breno");
        nomes2.add("Buca");

        nomes.addAll(nomes2);

        for (String nome : nomes) {
            System.out.println(nome);
        }

        nomes.add("Breno");
        System.out.println("--------");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

    }
}
