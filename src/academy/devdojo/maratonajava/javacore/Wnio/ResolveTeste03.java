package academy.devdojo.maratonajava.javacore.Wnio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class ResolveTeste03 {
    public static void main(String[] args) throws IOException {
       Path dir = Paths.get("home/ricardo");
        Path arquivo = Paths.get("dev/arquivo.txt");
        Path resolve = dir.resolve(arquivo);
        System.out.println(resolve);

        Path absoloto = Paths.get("/home/ricardo");
        Path relativo = Paths.get("dev");
        Path file = Paths.get("file.txt");

        System.out.println("1 " + absoloto.resolve(relativo));
        System.out.println("2 " + absoloto.resolve(file));
        System.out.println("3 " + relativo.resolve(absoloto));
        System.out.println("4 " + relativo.resolve(file));
        System.out.println("5 " + file.resolve(absoloto));
        System.out.println("6 " + file.resolve(relativo));

    }
}
