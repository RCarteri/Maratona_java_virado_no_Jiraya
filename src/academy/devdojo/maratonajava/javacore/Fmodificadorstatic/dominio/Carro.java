package academy.devdojo.maratonajava.javacore.Fmodificadorstatic.dominio;

public class Carro {
    private String nome;
    private double velocicadeMaxima;
    private static double velocidadeLimite = 250;

    public  void imprime(){
        System.out.println("-------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade Máxima: " + this.velocicadeMaxima);
        System.out.println("Velocidade Limite: " + Carro.velocidadeLimite);
    }

    public Carro(String nome, double velocicadeMaxima) {
        this.nome = nome;
        this.velocicadeMaxima = velocicadeMaxima;
    }

    public static void setVelocidadeLimite(double velocidadeLimite){
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public static double getVelocidadeLimite(){
        return velocidadeLimite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocicadeMaxima() {
        return velocicadeMaxima;
    }

    public void setVelocicadeMaxima(double velocicadeMaxima) {
        this.velocicadeMaxima = velocicadeMaxima;
    }
}
