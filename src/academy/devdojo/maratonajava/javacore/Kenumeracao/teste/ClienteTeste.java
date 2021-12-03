package academy.devdojo.maratonajava.javacore.Kenumeracao.teste;

import academy.devdojo.maratonajava.javacore.Kenumeracao.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Kenumeracao.dominio.TipoCliente;
import academy.devdojo.maratonajava.javacore.Kenumeracao.dominio.TipoPagamento;

public class ClienteTeste {
    public static void main(String[] args) {
        // Usa-se enumeração quando te uma escolha dentro de uma quantidade limitada de opções e precisa forçar o tipo a ser utilizado
        // Neste caso só poderia aceitar receber "PESSOA_JURIDICA" e "PESSOA_FISICA"
        Cliente cliente1 = new Cliente("Roi", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Tri", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getNomeRelatorio());
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomerelatorio("Pessoa Física");
        System.out.println(tipoCliente2);

    }
}
