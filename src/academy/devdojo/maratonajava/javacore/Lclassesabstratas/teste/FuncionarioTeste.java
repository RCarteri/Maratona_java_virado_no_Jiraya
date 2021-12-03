package academy.devdojo.maratonajava.javacore.Lclassesabstratas.teste;

import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;
// Uma classe abstrata não pode ser final, pois ela foi feita para ser extendida e final não pode ser extendida
// Um método abstrato não tem corpo e sempre vai ter que ser implementado quando a classe for herdada
// metodos abstratos so podem existir em classes abstratas

public class FuncionarioTeste {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 2900);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Toia", 3000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
    }
}
