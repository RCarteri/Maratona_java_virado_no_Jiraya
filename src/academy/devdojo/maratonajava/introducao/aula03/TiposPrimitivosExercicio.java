package academy.devdojo.maratonajava.introducao.aula03;
/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
Eu <nome>, morando no endereço <endereco>,
confirmo que recebi o salário de <salário>, na data <data>
 */
public class TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Ricardo";
        String endereco = "Uruguai 1040";
        double salario = 4170;
        String data = "01/01/2022";
        System.out.println("Eu " + nome + ", morando no endereço " + endereco
                + "\nconfirmo que recebi o salário de " + salario + " na data " + data);
    }
}
