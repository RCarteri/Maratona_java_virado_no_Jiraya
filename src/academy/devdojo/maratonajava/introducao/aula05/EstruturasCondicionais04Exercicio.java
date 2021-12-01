package academy.devdojo.maratonajava.introducao.aula05;

public class EstruturasCondicionais04Exercicio {
    public static void main(String[] args) {
        // R$0        R$34.712   9.7%
        // R$34,713   R$68,507   37.35%
        // R$68,508              49.50%
        double salario = 25000;
        double taxa;
        if (salario <= 34712){
            taxa = 9.7;
        }else if (salario < 68507){
            taxa = 37.35;
        }else{
            taxa = 49.50;
        }
        double imposto = salario * taxa/100;
        System.out.println(imposto);

    }
}
