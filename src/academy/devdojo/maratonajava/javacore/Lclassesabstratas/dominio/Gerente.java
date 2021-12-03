package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;

public class Gerente extends Funcionario{
    @Override
    public void calculaBonus() {
        this.salario += salario * 0.2;
    }

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }
}
