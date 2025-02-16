package academy.devdojo.maratonajava.javacore.EblocosInicializacao.test;

import academy.devdojo.maratonajava.javacore.EblocosInicializacao.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        for (int i = 0; i < anime.getEpisodios().length; i++) {
            System.out.println(anime.getEpisodios()[i]);
        }

    }
}
