package academy.devdojo.maratonajava.javacore.Gassociacao.exercicio;

public class Seminario {
    private String titulo;
    private Local local;
    private Aluno[] alunos;

    public Seminario(String titulo, Local local) {
        this.titulo = titulo;
        this.local = local;
    }

    public Seminario(String titulo, Local local, Aluno[] alunos) {
        this(titulo, local);
        this.alunos = alunos;
    }

    public void imprime() {
        System.out.println(this.titulo);
        local.imprime();
        if (this.getAlunos() == null || this.getAlunos().length == 0) return;
        System.out.println("----Alunos----");
        for (Aluno aluno : this.getAlunos()) {
            aluno.imprime();
        }
        System.out.println();
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
