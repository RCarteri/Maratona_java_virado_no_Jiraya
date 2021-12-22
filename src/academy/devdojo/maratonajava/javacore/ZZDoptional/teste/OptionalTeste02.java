package academy.devdojo.maratonajava.javacore.ZZDoptional.teste;

import academy.devdojo.maratonajava.javacore.ZZDoptional.dominio.Manga;
import academy.devdojo.maratonajava.javacore.ZZDoptional.repositorio.MangaRepository;

import java.util.List;
import java.util.Optional;

public class OptionalTeste02 {
    public static void main(String[] args) {
        //Se encontrar o titulo renomeia
        Optional<Manga> mangaByTitle = MangaRepository.findByTitle("Boku");
        mangaByTitle.ifPresent(m -> m.setTitle("Boku 2"));
        System.out.println(mangaByTitle);

        //Se não encontrar o id lança uma excessão
        Manga mangaById = MangaRepository.findById(2).orElseThrow(IllegalArgumentException::new);
        System.out.println(mangaById);

        //Se não encontrar o título, cria um novo manga
        Manga newManga = MangaRepository.findByTitle("Drifters")
                .orElseGet(() -> new Manga(4, "Drifters", 20));
        System.out.println(newManga);
    }
}
