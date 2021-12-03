package academy.devdojo.maratonajava.javacore.Hheranca.teste;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTeste02 {
    public static void main(String[] args) {
        /*
        0- Bloco de inicializacao estático da superclasse é executado quando a JVM carregar a classe pai
        1- Bloco de inicializacao estático da subclasse é executado quando a JVM carregar a classe filha
        2- Alocado espaço em memória para o objeto da superclasse
        3- Cada atributo de superclasse é criado e inicializado com valores default ou  o que for passado da classe pai
        4- Bloco de inicialização da superclasse é executado na ordem em que aparece
        5- Construtor da superclasse é executado
        6- Alocado espaço em memória para o objeto da subclasse
        7- Cada atributo de subclasse é criado e inicializado com valores default ou  o que for passado da classe pai
        8- Bloco de inicialização da subclasse é executado na ordem em que aparece
        9- Construtor da subclasse é executado

        Dentro do bloco de inicializacao estatico de pessoa
        Dentro do bloco de inicializacao estatico de funcionario
        Dentro do bloco de inicializacao de pessoa 1
        Dentro do bloco de inicializacao de pessoa 2
        Dentro do construtor de pessoa
        Dentro do bloco de inicializacao de funcionario 1
        Dentro do bloco de inicializacao de funcionario 2
        Dentro do construtor de funcionario
        */
        Endereco endereco = new Endereco();
        endereco.setCep("0000-990");
        endereco.setRua("Rua A");

        Funcionario funcionario = new Funcionario("Douglas");
        funcionario.setCpf("9893434");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);

        funcionario.imprime();
    }
}
