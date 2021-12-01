package academy.devdojo.maratonajava.introducao.aula05;

public class EstruturasCondicionais06Exercicio {
    public static void main(String[] args) {
        // Utilizando switch e dados os valores de 1 a 7, imprima se é dia util ou final de semana

        int dia = 5;
        switch (dia){
            case 1:
            case 7:
                System.out.println("Fim de semana");
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 2:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Inválido");
                break;
        }
    }
}
