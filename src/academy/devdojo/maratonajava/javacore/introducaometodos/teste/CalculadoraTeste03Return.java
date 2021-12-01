package academy.devdojo.maratonajava.javacore.introducaometodos.teste;

import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Calculadora;

public class CalculadoraTeste03Return {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divisao(6,2);
        System.out.println(result);
        calculadora.divisao2(2,0);
    }
}
