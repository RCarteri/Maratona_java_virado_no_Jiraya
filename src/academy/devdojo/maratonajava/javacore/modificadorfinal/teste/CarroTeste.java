package academy.devdojo.maratonajava.javacore.modificadorfinal.teste;

import academy.devdojo.maratonajava.javacore.modificadorfinal.dominio.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Ruio");
        System.out.println(carro.COMPRADOR);

    }
}
