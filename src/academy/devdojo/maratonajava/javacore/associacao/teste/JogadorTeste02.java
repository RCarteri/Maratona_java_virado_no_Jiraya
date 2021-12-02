package academy.devdojo.maratonajava.javacore.associacao.teste;

import academy.devdojo.maratonajava.javacore.associacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.associacao.dominio.Time;

public class JogadorTeste02 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Pelé");
        Time time = new Time("Seleção brasileira");
        jogador.setTime(time);
        jogador.imprime();

    }
}
