package academy.devdojo.maratonajava.javacore.Qstring.teste;

public class StringPerformanceTete {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(30_000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para String " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuilder(10_000_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para String Builder " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(10_000_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para String Buffer " + (fim - inicio) + "ms");
    }
    private static void concatString(int tamanho){
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto +=i;
        }
    }
    private static void concatStringBuilder(int tamanho){
        StringBuilder texto = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            texto.append(i);
        }
    }
    private static void concatStringBuffer(int tamanho){
        StringBuffer texto = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            texto.append(i);
        }
    }
}
