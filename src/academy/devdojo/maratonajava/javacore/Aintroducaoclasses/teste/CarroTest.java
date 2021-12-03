package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class CarroTest {
    public static void main(String[] args) {
        Professor.Carro carro = new Professor.Carro();
        carro.nome = "Bento";
        carro.ano = 1996;
        carro.modelo = "Celta";

        Professor.Carro carro2 = new Professor.Carro();
        carro2.nome = "Chico";
        carro2.ano = 1994;
        carro2.modelo = "Uno";

        System.out.println("Carro1: " + carro.nome + " " + carro.modelo + " " + carro.ano);
        System.out.println("Carro2: " + carro2.nome + " " + carro2.modelo + " " + carro2.ano);
    }
}
