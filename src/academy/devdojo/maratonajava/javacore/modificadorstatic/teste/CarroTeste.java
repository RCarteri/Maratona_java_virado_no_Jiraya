package academy.devdojo.maratonajava.javacore.modificadorstatic.teste;

import academy.devdojo.maratonajava.javacore.modificadorstatic.dominio.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        // Modificador de acessso static vai fazer o atributo pertencer a classe e todos os obetos vão compartilhar o mesmo valor
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedes", 275);
        Carro c3 = new Carro("Audi", 290);

        Carro.setVelocidadeLimite(180);
        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
