package academy.devdojo.maratonajava.javacore.Oexception.runtime.teste;

/*
Usa-se throw new quando se quer lançar uma exceção personalizada, na maioria das vezes vai ser do tipo runtime, mas também pode ser do tipo checked
Quando o throw new é do tipo runtime não há necessidade de colocar na assinatura do método um aviso pra quem está chamando o método, mas é obrigatório quando é checked

 */
public class RuntimeExceptionTeste02 {
    public static void main(String[] args) {
        divisao(1, 0);
        System.out.println("Codigo finalizado");
    }

    /**
     *
     * @param a
     * @param b não pode ser 0
     * @return
     * @throws IllegalArgumentException caso b seja zero
     */
    private static int divisao(int a, int b){
        if (b == 0){
            throw new IllegalArgumentException("Argumento ilegal, não pode ser 0");
        }
        return a/b;
    }
}
