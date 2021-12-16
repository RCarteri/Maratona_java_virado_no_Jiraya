package academy.devdojo.maratonajava.javacore.Xserializacao.dominio;

import java.io.*;

public class Aluno implements Serializable {
    private static final long serialVersionUID = -2543438756051506238L; // usado para o java saber se voce pode deserializar, ele é usado para saber se nada foi alterado
    private Long id;
    private String nome;
    private transient String password; // transient para ignorar um campo na serialização. Vai aparecer como null
    private static final String NOME_ESCOLA = "DevDojo Viradão no Jiraya"; // Atributos estáticos pertencem a classe e não ao objeto então não sao serializados
    private transient Turma turma; // Se voce não tem acesso ao codigo fonnte da classe e deseja serializar deve-se adicionar o transiente e criar um método para escrita e leitura do objeto

    public Aluno(Long id, String nome, String password) {
        System.out.println("Dentro do construtor");
        this.id = id;
        this.nome = nome;
        this.password = password;
    }


    // O método precisa ser com esse nome pois é um "override"
    private void writeObject(ObjectOutputStream oos){
        try{
            // Primeiro salva da forma padrão
            oos.defaultWriteObject();
            // Em seguida salvar o que não faz parte do default, mas como não é serializavel vc só pode escrever e não salvar
            oos.writeUTF(turma.getNome());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    // O método precisa ser com esse nome pois é um "override"
    private void readObject(ObjectInputStream ois){
        try{
            ois.defaultReadObject();
            String nomeTurma = ois.readUTF();
            turma = new Turma(nomeTurma);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getPassword() {
        return password;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", password='" + password + '\'' +
                ", NOME_ESCOLA='" + NOME_ESCOLA + '\'' +
                ", Turma='" + turma + '\'' +
                '}';
    }
}
