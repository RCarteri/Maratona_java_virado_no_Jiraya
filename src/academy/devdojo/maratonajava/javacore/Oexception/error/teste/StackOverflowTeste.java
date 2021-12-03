package academy.devdojo.maratonajava.javacore.Oexception.error.teste;

// Erro é algo que acontece na JVM que não é possível recuperar em tempo de execução
// Neste caso o metodo vai ficar se chamando infinitamente até o programa dar um erro de StackOverflowError
public class StackOverflowTeste {
    public static void main(String[] args) {
        recursividade();
    }
    public static void recursividade(){
        recursividade();
    }
}
