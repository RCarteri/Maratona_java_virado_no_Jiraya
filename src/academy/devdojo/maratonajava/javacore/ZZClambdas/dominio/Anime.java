package academy.devdojo.maratonajava.javacore.ZZClambdas.dominio;

public class Anime {
    private String title;
    private int episodes;

    @Override
    public String
    toString() {
        return "Anime{" +
                "title='" + title + '\'' +
                ", episodes=" + episodes +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public Anime(String title, int quantity) {
        this.title = title;
        this.episodes = quantity;
    }
}
