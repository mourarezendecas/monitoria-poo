package exercicio1005.musicaecompositores;

public class Main {
    public static void main(String[] args) {
        Compositor compositor = new Compositor("Tom jobim", "Brasileiro");
        System.out.println(compositor.toString());

        Musica musica = new Musica("Wave", 1980, compositor);

        System.out.println(musica.toString());
    }
}
