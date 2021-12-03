package academy.devdojo.maratonajava.javacore.Oexception.exception.teste;

import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.LoginInvalidoException;
import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.Pessoa;

import java.io.FileNotFoundException;

// Quando está sobrescrevendo um metodo não é obrigado a declarar as mesmas excecoes que o metodo está declarando neste caso LoginInvalidoException e FileNotFoundException
// Porque a funcionalidade da sobrescrita pode ser diferente e não lance excessao
// Pode lançar qualque exceção do tipo unchecked vindas de runtimeException
// Não pode lançar exceções mais genéricas ou do tipo checked
public class SobrescritaComExceptionTeste {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException | FileNotFoundException  e) {
            e.printStackTrace();
        }
    }
}
