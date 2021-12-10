package academy.devdojo.maratonajava.javacore.Vio.teste;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

public class FileWriterTeste {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true)){
            fw.write("Escrevendo no novo arquivo\nContinuando na próxima linha");
            fw.flush(); // Para limpar o buffer
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
