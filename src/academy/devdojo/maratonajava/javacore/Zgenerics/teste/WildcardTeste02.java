package academy.devdojo.maratonajava.javacore.Zgenerics.teste;

import java.util.List;

public class WildcardTeste02 {
    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());
    }
    // ? é um coringa (wildcard) que diz que aceita qualquer classe que extende Animal, usando isso não pode adicionar nada na lista
    private static void printConsulta(List<? extends Animal> animals){
        for (Animal animal : animals) {
            animal.consulta();
        }
    }
    //Para poder adicionar usa-se o super, que pega da classe passada pra cima Animal .. Object
    private static void printConsultaAnimal(List<? super Animal> animals){
        animals.add(new Cachorro());
        animals.add(new Gato());
    }
}
