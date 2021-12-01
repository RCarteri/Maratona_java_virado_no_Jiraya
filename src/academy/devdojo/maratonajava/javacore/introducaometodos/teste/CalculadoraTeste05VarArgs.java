package academy.devdojo.maratonajava.javacore.introducaometodos.teste;

import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Calculadora;

public class CalculadoraTeste05VarArgs {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] array = {1, 2, 3, 4, 5};
        calculadora.somaArray(array);
        calculadora.somaVarArgs(1, 2, 3, 4, 5);
    }
}
