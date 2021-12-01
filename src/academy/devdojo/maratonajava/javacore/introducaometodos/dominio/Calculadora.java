package academy.devdojo.maratonajava.javacore.introducaometodos.dominio;

public class Calculadora {
    public void soma(){
        System.out.println(10 + 10);
    }

    public void subtracao(){
        System.out.println(10 - 10);
    }
    public void multiplicacao(int n1, int n2){
        System.out.println(n1 * n2);
    }
    public double divisao(double n1, double n2){
        if (n2 == 0) return 0;
        return n1 / n2;
    }
    public void divisao2(double n1, double n2){
        if (n2 == 0) {
            System.out.println("Não existe divisão por 0");
            return;
        }
        System.out.println(n1 / n2);
    }
    public void alteraNumeros(int n1, int n2){
        n1 = 99;
        n2 = 33;
        System.out.println("Dentro do alteraNumeros");
        System.out.println("N1: " + n1);
        System.out.println("N2: " + n2);
    }

    public void somaArray(int[] numeros){
        int soma = 0;
        for (int numero: numeros) {
            soma += numero;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros){
        int soma = 0;
        for (int numero: numeros) {
            soma += numero;
        }
        System.out.println(soma);
    }
}
