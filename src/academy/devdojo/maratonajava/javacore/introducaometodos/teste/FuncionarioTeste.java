package academy.devdojo.maratonajava.javacore.introducaometodos.teste;

import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Funcionario;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Ricardo");
        funcionario.setIdade(20);
        funcionario.setSalarios(new double[]{1000, 2000, 3000});

        funcionario.imprimir();
    }
}
