package academy.devdojo.maratonajava.javacore.sobrecargametodos.teste;

import academy.devdojo.maratonajava.javacore.sobrecargametodos.dominio.Anime;

public class AnimeTeste {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Naruto", "TV", 12,"Ficção");
        anime.imprime();
    }
}
