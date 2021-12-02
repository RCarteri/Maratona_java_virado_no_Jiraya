package academy.devdojo.maratonajava.javacore.introducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios = new double[3];
    private double media;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }

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

        for (double salario: salarios) {
            media += salario;
        }
        media /= salarios.length;
        System.out.println("\nA média dos salários do funcionário " + nome + " é " + media);
    }
}
