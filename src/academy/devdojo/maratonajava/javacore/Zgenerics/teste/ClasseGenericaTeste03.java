package academy.devdojo.maratonajava.javacore.Zgenerics.teste;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;
import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Zgenerics.service.BarcoRentavelService;
import academy.devdojo.maratonajava.javacore.Zgenerics.service.RentavelService;

import java.util.ArrayList;
import java.util.List;

//Em vez de criar um classe pra tratar cada tipo de objeto, foi criada uma classe genérica com o <T> que substitui as classes passadas como parâmetros
public class ClasseGenericaTeste03 {
    public static void main(String[] args) {
        List<Carro> carroDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Fusca")));
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));
        RentavelService<Carro> carroRentavelService = new RentavelService<>(carroDisponiveis);
        Carro carro = carroRentavelService.buscarObjetosDisponivel();
        System.out.println("Usando o carro por um mês...");
        carroRentavelService.retornarObjetoAlugado(carro);

        System.out.println("--------");
        RentavelService<Barco> barcoRentavelService = new RentavelService<>(barcosDisponiveis);
        Barco barco = barcoRentavelService.buscarObjetosDisponivel();
        System.out.println("Usando o barco por um mês...");
        barcoRentavelService.retornarObjetoAlugado(barco);
    }
}
