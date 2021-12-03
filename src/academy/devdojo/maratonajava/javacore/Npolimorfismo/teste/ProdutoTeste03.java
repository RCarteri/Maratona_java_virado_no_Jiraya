package academy.devdojo.maratonajava.javacore.Npolimorfismo.teste;


import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 98", 9000);
        Tomate tomate = new Tomate("Americano", 7);
        tomate.setDataValidade("21/03/2012");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("------");
        CalculadoraImposto.calcularImposto(produto);
    }
}
