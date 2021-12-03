package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import java.util.Scanner;

public class LeituraDoTecladoTeste02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("O grane software de previsão do futuro");
        System.out.println("Digite sua pergunta que eu responderei sim ou não...");
        String pergunta = scan.nextLine();
        if (pergunta.charAt(0) == ' '){
            System.out.println("Sim");
        }else {
            System.out.println("Não");
        }
    }
}
