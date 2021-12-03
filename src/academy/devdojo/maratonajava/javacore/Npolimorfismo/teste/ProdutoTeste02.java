package academy.devdojo.maratonajava.javacore.Npolimorfismo.teste;


import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

// Pelo jeito que o produto foi instanciado, não posso acessar a variavel dataValidade pois não é visivel pela classe pai
public class ProdutoTeste02 {
    public static void main(String[] args) {
        Produto produto = new Tomate("Americano", 9000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
        // System.out.println(produto.dataValidade);
    }
}
