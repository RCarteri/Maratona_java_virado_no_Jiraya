package academy.devdojo.maratonajava.javacore.introducaometodos.dominio;

public class ImpressoraEstudante {
    public void imprime(Estudante estudante){
        System.out.println("Nome: " + estudante.nome + " Idade: " + estudante.idade + " Sexo: " + estudante.sexo);
        // Alterando o nome para a próxima iteracao da mesma referencia
        estudante.nome = "Fabio";
    }
}
