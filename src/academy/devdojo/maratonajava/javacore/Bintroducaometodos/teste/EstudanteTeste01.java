package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();
        ImpressoraEstudante impressoraEstudante = new ImpressoraEstudante();

        estudante.nome = "Ricardo";
        estudante.idade = 13;
        estudante.sexo = 'M';

        estudante2.nome = "Maria";
        estudante2.idade = 14;
        estudante2.sexo = 'F';

        impressoraEstudante.imprime(estudante);
        impressoraEstudante.imprime(estudante2);
        System.out.println("------------");
        impressoraEstudante.imprime(estudante);
        impressoraEstudante.imprime(estudante2);
        System.out.println("------------");
        estudante2.imprimir();
        estudante2.imprimir();
    }
}
