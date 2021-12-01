package academy.devdojo.maratonajava.introducao.aula07;

public class Arrays02 {
    public static void main(String[] args) {
        // Quando não se inicializa as variáveis os valores padrão são:
        // byte, short, int, long, float e double = 0
        // char = '/u000' ' '
        // boolean = false
        // String = null
        String[] nomes = new String[3];
        nomes[0] = "Ricardo";
        nomes[1] = "Pedro";
        nomes[2] = "Carlos";
        for (int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }
    }
}
