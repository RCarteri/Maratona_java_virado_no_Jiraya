package academy.devdojo.maratonajava.javacore.Xserializacao.teste;

import academy.devdojo.maratonajava.javacore.Xserializacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Xserializacao.dominio.Turma;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
// Serialização: Pegar um objeto e através de um array de bytes você persistir (salvar o estado dele) ele em algum lugar.
// Neste caso o estado atual do Objeto Aluno foi serializado em um arquivo "aluno.ser"
public class SerializacaoTeste {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(1L, "Carteri", "123456");
        Turma turma = new Turma("Maratona Java Virado no Jiraya em breve ricos");
        aluno.setTurma(turma);
        serializar(aluno);
        deserializar();
    }
    private static void serializar(Aluno aluno){
        Path path = Paths.get("pasta2/aluno.ser");
        try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))){
            oos.writeObject(aluno);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void deserializar(){
        Path path = Paths.get("pasta2/aluno.ser");
        try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))){
            Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno);
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
