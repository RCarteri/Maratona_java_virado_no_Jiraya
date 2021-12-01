package academy.devdojo.maratonajava.introducao.aula06;

public class EstruturasDeRepeticao04Exercicio {
    public static void main(String[] args) {
        // Dado o valor de um carro descubra em quantas vezes ele pode ser parcelado
        // O valor da parcela tem que ser >= 1000
        double valorCarro = 30000;
        for (int parcela = 1; parcela <= valorCarro; parcela++) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000) break;
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }
    }
}
