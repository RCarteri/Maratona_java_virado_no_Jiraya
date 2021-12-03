package academy.devdojo.maratonajava.javacore.Oexception.runtime.teste;

// Bloco finally sempre será executado
// Usado quando precisa trabalhar com recursos sendo liberados por outrasa aplicações que precisam ser fechadas após o seu uso
public class RuntimeExceptionTeste03 {
    public static void main(String[] args) {
        abreConexao();
        abreConexao2();
    }
    private static String abreConexao(){
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            return "Conexão aberta";
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
        return null;
    }

    private static void abreConexao2(){
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            throw new RuntimeException();
        }finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
    }
}
