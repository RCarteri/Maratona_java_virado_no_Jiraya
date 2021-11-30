package academy.devdojo.maratonajava.introducao.aula02;

public class TiposPrimitivos {
    public static void main(String[] args) {
        //int, double, float, char, short, byte, long, boolean
        int idade = 10;
        long numeroGrande = 100000L;
        double salarioDouble = 2000.0D;
        float salarioFloat = (float) 2500.0D; // fazendo um casting = forçando a alocação de um valor em um tipo de variavel
        byte idadeByte = 127;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';
        String nome = "Pietro";

        System.out.println("A idade é " + idade + " anos.");
        System.out.println(falso);
        System.out.println("char " + caractere);
        System.out.println(numeroGrande);
        System.out.println("Oi meu nome é " + nome);
    }
}
