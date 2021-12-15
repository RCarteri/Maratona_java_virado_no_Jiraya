package academy.devdojo.maratonajava.javacore.Vio.teste;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterTeste {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true);
             BufferedWriter bw = new BufferedWriter(fw)){
            bw.write("Escrevendo no novo arquivo");
            bw.newLine();
            bw.write("Continuando na próxima linha");
            bw.flush(); // Para limpar o buffer
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
