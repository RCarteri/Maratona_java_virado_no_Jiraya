package academy.devdojo.maratonajava.javacore.Vio.teste;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

public class FileTeste02 {
    public static void main(String[] args) throws IOException {
        File fileDiretorio = new File("pasta");
        boolean isDiretorioCreated = fileDiretorio.mkdir();
        System.out.println("Pasta criada? " + isDiretorioCreated);

        File fileArquivo = new File(fileDiretorio, "arquivo.txt");
        boolean isFileCreated = fileArquivo.createNewFile();
        System.out.println("arquivo.txt criado? " + isFileCreated);

        File fileRenamed = new File(fileDiretorio, "arquivo_renomeado.txt");
        boolean isRenamed = fileArquivo.renameTo(fileRenamed);
        System.out.println("arquivo.txt renomeado? " + isRenamed);

        File diretorioRenamed = new File("pasta2");
        boolean isDiretorioRenamed = fileDiretorio.renameTo(diretorioRenamed);
        System.out.println("Diretorio renomeado? " + isDiretorioRenamed);
    }
}
