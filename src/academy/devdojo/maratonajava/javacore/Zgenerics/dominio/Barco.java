package academy.devdojo.maratonajava.javacore.Zgenerics.dominio;

public class Barco {
    private String nome;

    @Override
    public String toString() {
        return "Barco{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public Barco(String nome) {
        this.nome = nome;
    }
}
