package academy.devdojo.maratonajava.javacore.ZZAclassesinternas;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//Como seria usado sem ser anonima
// Classes anênimas são classes que irão existir por um determinado momento e que não vão poder ser reutilizadas
//Neste caso foi implementado uma casse anonima e ordenação
class BarcoNameComparator implements Comparator<Barco>{
    @Override
    public int compare(Barco o1, Barco o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}

public class AnonymousClassesTeste {
    public static void main(String[] args) {
        List<Barco> barcoList = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));
        barcoList.sort(new Comparator<Barco>() {
            @Override
            public int compare(Barco o1, Barco o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });
        // Para resumir o bloco acima pode-se utilizar o lambda
        barcoList.sort((o1, o2) -> o1.getNome().compareTo(o2.getNome()));
    }
}
