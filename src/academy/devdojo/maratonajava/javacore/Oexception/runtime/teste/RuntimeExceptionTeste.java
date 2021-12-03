package academy.devdojo.maratonajava.javacore.Oexception.runtime.teste;

// Há dois tipos que são exceções lançadas em tempo de execução
// CHECKED
// Lança um erro em tempo de compilação que nem vai conseguir compilar o código
// É obrigatório tratar

// UNCHECKED
// Exceção que quando lançada pelo programa é porque o código está errado
// Não é obrigatório tratar
public class RuntimeExceptionTeste {
    public static void main(String[] args) {
        // Exemplo UNCHECKED
        // NullPointerException pois não informei nenhum objeto de referencia
        Object object = null;
        System.out.println(object.toString());

        // ArrayIndexOutOfBounds não existe essa posição no array
        int[] nums = {1,2};
        System.out.println(nums[2]);
    }
}
