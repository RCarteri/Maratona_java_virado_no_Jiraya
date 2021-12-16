package academy.devdojo.maratonajava.javacore.Ycolecoes.Teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.Dominio.Smartphone;

public class EqualsTeste {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1", "iPhone");
        Smartphone s2 = new Smartphone("1ABC1", "iPhone");
        System.out.println(s1.equals(s2)); // antes da sobrescrita do equals retorna falso pois as variáveis estão apontando pra referencias diferentes
// Mas nesse caso vai retornar sempre true se os serialNumber forem iguais nao importa a marca
    }
}
