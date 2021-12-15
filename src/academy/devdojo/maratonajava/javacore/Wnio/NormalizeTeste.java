package academy.devdojo.maratonajava.javacore.Wnio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class NormalizeTeste {
    public static void main(String[] args) throws IOException {
       String diretorioProjeto = "home/ricardo/dev";
       String arquivoTxt = "../../arquivo.txt";
        Path path1 = Paths.get(diretorioProjeto, arquivoTxt);
        System.out.println(path1);
        System.out.println(path1.normalize());
        Path path2 = Paths.get("/home/./ricardo/./dev/");
        System.out.println(path2);
        System.out.println(path2.normalize());

    }
}
