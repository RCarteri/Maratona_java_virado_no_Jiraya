package academy.devdojo.maratonajava.javacore.Qstring.teste;

public class StringBuilderTeste {
    public static void main(String[] args) {
        String nome = "Ricardo Carteri"; //String constant pool
        nome += " DevDojo";
        nome.substring(0,3);
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("Ricardo Carteri");
        sb.append(" Devdojo").append(" Academy");
        sb.reverse();
        System.out.println(sb);
        sb.reverse();
        sb.delete(0,3);
        System.out.println(sb);
    }
}
