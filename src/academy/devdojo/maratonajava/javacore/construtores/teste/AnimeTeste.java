package academy.devdojo.maratonajava.javacore.construtores.teste;

import academy.devdojo.maratonajava.javacore.construtores.dominio.Anime;

public class AnimeTeste {
    public static void main(String[] args) {
        Anime anime = new Anime("Naruto", "TV", 12,"Ficção", "BR");
        anime.imprime();
    }
}
