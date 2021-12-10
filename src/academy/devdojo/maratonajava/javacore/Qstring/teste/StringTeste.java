package academy.devdojo.maratonajava.javacore.Qstring.teste;

public class StringTeste {
    public static void main(String[] args) {
        String nome = "Ricardo"; //String constant pool
        String nome2 = "Ricardo";
        nome = nome.concat(" Carteri"); // nome += " Carteri";
        System.out.println(nome);
        System.out.println(nome == nome2); // Não compara o valor e sim o objeto de referencia
        String nome3 = new String("Ricardo"); // Não utilizar, pois uando fazemos isso estamos criando: 1 variável de referência, 2 objeto do tipo String, 3 uma string no pool de string
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}
