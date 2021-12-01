package academy.devdojo.maratonajava.javacore.introducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios = new double[3];
    public void imprimir(){
        System.out.print("Nome:" + nome + " Idade: " + idade + " Salários: ");
        if (salarios == null) return;
        for (double salario: salarios) {
            System.out.print(salario + " ");
        }
        imprimirMediaSalarios();
    }
    public void imprimirMediaSalarios(){
        if(salarios == null) return;
        double media = 0;
        for (double salario: salarios) {
            media += salario;
        }
        media /= salarios.length;
        System.out.println("\nA média dos salários do funcionário " + nome + " é " + media);
    }
}
