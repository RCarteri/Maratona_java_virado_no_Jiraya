package academy.devdojo.maratonajava.javacore.Wnio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTeste {
    public static void main(String[] args) {
        Path path1 = Paths.get("C:\\Users\\ruehlein\\ftabb\\projetos\\Maratona_java_virado_no_Jiraya\\file.txt");
        Path path2 = Paths.get("C:\\Users\\ruehlein\\ftabb\\projetos\\Maratona_java_virado_no_Jiraya", "file.txt");
        Path path3 = Paths.get("C:", "Users\\ruehlein\\ftabb\\projetos\\Maratona_java_virado_no_Jiraya\\file.txt");
        Path path4 = Paths.get("C:", "Users", "ruehlein", "ftabb", "projetos", "Maratona_java_virado_no_Jiraya", "file.txt");
        Path path5 = Paths.get("file.txt");
        System.out.println(path1.getFileName());
        System.out.println(path2.getFileName());
        System.out.println(path3.getFileName());
        System.out.println(path4.getFileName());
        System.out.println(path5.getFileName());
    }
}
