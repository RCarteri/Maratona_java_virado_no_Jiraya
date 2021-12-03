package academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto){
        double imposto = produto.calcularImposto();
        System.out.println("Relatório de imposto");
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
        if (produto instanceof Tomate){
//            Maneira 1
//            Tomate tomate = (Tomate) produto;
//            System.out.println(tomate.getDataValidade());
//            Maneira 2
//            String dataValidade = ((Tomate) produto).getDataValidade();
//            System.out.println(dataValidade);

            System.out.println(((Tomate) produto).getDataValidade());
        }
    }
}
