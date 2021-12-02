package academy.devdojo.maratonajava.javacore.associacao.teste;

import academy.devdojo.maratonajava.javacore.associacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.associacao.dominio.Professor;

public class EscolaTeste {
    public static void main(String[] args) {
        Professor professor = new Professor("Jiraya");
        Professor professor2 = new Professor("Kakashi");
        Professor[] professores = {professor, professor2};
        Escola escola = new Escola("Francisco", professores);

        escola.imprime();
    }
}
