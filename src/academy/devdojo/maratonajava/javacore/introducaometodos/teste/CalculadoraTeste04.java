package academy.devdojo.maratonajava.javacore.introducaometodos.teste;

import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Calculadora;

public class CalculadoraTeste04 {
    public static void main(String[] args) {
        int n1 = 2;
        int n2 = 3;
        Calculadora calculadora = new Calculadora();
        calculadora.alteraNumeros(n1, n2);
        System.out.println(n1 + " " + n2);
    }
}
