package academy.devdojo.maratonajava.javacore.associacao.exercicio;

public class Teste {
    /*
    Crie um sistema que gerencie seminarios
    O sistema deverá cadastrar seminarios, estudantes, professores e local onde será realizado

    Um aluno pode estar em apenas um seminario
    Um seminário poderá ter nenhum ou vários alunos
    Um professor poderá ter vários seminários
    Um seminário deve ter um local

    Campos básicos:
    seminário: título
    aluno: nome e idade
    professor: nome, especialidade
    local: endereço
     */
    public static void main(String[] args) {
        Local local = new Local("av ipiranga");

        Seminario seminario1 = new Seminario("Reunião", local);
        Seminario seminario2 = new Seminario("Encontro", local);
        Seminario[] seminarios = {seminario1, seminario2};

        Aluno aluno1 = new Aluno("Ricardo", 23, seminario1);
        Aluno aluno2 = new Aluno("Pedro", 25, seminario2);
        Aluno[] alunos = {aluno1, aluno2};

        seminario1.setAlunos(alunos);

        Professor professor1 = new Professor("Ari", "Dev", seminarios);
        Professor professor2 = new Professor("Rui", "Web", new Seminario[]{seminario1});
        Professor[] professores = {professor1, professor2};

        for (Professor professor : professores) {
            System.out.println("*******");
            professor.imprime();
        }
    }
}
