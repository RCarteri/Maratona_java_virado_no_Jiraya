package academy.devdojo.maratonajava.javacore.Npolimorfismo.teste;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

// Se você não acessar nenum atributo da classe você pode definir o método como estático
public class ProdutoTeste {
    public static void main(String[] args) {
        Computador computador = new Computador("Nuc10", 2000);
        Tomate tomate = new Tomate("gaucho", 10);
        Televisao televisao = new Televisao("Samsung 50\"", 4000);

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("------------");
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("--------------");
        CalculadoraImposto.calcularImposto(televisao);
    }
}
