package academy.devdojo.maratonajava.javacore.associacao.exercicio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprime(){
        System.out.println("Professor: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);
        if (this.seminarios == null) return;
        System.out.println("----Seminarios----");
        for (Seminario seminario : this.seminarios) {
            seminario.imprime();
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
