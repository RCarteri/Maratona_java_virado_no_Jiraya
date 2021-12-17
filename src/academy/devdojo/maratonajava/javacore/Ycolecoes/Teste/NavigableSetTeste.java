package academy.devdojo.maratonajava.javacore.Ycolecoes.Teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.Dominio.Manga;
import academy.devdojo.maratonajava.javacore.Ycolecoes.Dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneMarcaComparator implements Comparator<Smartphone>{

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class MangaPrecoComparator implements Comparator<Manga>{

    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}
// Quando deve usar o TReeSet?
//Quando a classe que está criando a coleção implementa um Comparable ou você pode criar um comparator (SmartphoneMarcaComparator)
//Todas as vezes que inserir um elemento o TreeSet vai reordenar a coleção baseado no valor ou do compareTo da classe (Manga) ou do que passou no comparator (SmartphoneMarcaComparator)
//Ele não usa o equals para verificar se dois elementos são iguais, por isso é importante garantir que o comparator esteja ok, neste caso só vai identificar sendo igual quando o nome for igual, por causa do compareTo do Manga
public class NavigableSetTeste {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);
        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());
        mangas.add(new Manga(5L, "Naruto", 19.9, 0));
        mangas.add(new Manga(1L, "Pokemon", 1.9, 1));
        mangas.add(new Manga(3L, "Baby", 10.9, 0));
        mangas.add(new Manga(2L, "Dragon", 3.9, 8));
        mangas.add(new Manga(4L, "Shark", 3.2, 0));
        mangas.add(new Manga(4L, "Shark", 5.9, 0)); // Não vai ser salvo

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga youyou = new Manga(21L, "Youyou", 3.2, 5);

//        Métodos para comparação que retornarao o resultado imediatamente <, <=, >, >=:
//        lower <
//        floor <=
//        higher >
//        ceiling >=
        System.out.println("----------");
        System.out.println(mangas.lower(youyou));
        System.out.println(mangas.floor(youyou));
        System.out.println(mangas.higher(youyou));
        System.out.println(mangas.ceiling(youyou));


    }
}
