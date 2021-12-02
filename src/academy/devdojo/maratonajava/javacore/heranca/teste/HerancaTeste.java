package academy.devdojo.maratonajava.javacore.heranca.teste;

import academy.devdojo.maratonajava.javacore.heranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.heranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.heranca.dominio.Pessoa;

public class HerancaTeste {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setCep("0000-990");
        endereco.setRua("Rua A");

        Pessoa pessoa = new Pessoa("Carlos");
        pessoa.setCpf("9878787");
        pessoa.setEndereco(endereco);

        pessoa.imprime();
        System.out.println("----------");

        Funcionario funcionario = new Funcionario("Douglas");
        funcionario.setCpf("9893434");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);

        funcionario.imprime();
    }
}
