package academy.devdojo.maratonajava.javacore.heranca.dominio;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;
    static {
        System.out.println("Dentro do bloco de inicializacao estatico de pessoa");
    }
    {
        System.out.println("Dentro do bloco de inicializacao de pessoa 1");
    }
    {
        System.out.println("Dentro do bloco de inicializacao de pessoa 2");
    }
    public void imprime(){
        System.out.println("Nome: " + this.nome + "CPF: " + this.cpf);
        System.out.println(this.endereco.getRua() + " " + this.endereco.getCep());
    }

    public Pessoa(String nome, String cpf) {
        this(nome);
        this.cpf = cpf;
    }

    public Pessoa(String nome) {
        super();
        System.out.println("Dentro do construtor de pessoa");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
