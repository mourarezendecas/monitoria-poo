// Classe Música
public class Musica {
    private String nome;
    private int ano;
    private String tipo;
    private Compositor compositor;

    public Musica(String nome, int ano, String tipo, Compositor compositor) {
        this.nome = nome;
        this.ano = ano;
        this.tipo = tipo;
        this.compositor = compositor;
    }

    public String toString() {
        return "Nome da música: " + nome + "\nAno: " + ano + "\nTipo: " + tipo + "\nCompositor: " + compositor.getNome();
    }
}

// Classe Compositor
public class Compositor {
    private String nome;
    private String nacionalidade;

    public Compositor(String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    public String getNome() {
        return nome;
    }

    public String toString() {
        return "Nome do compositor: " + nome + "\nNacionalidade: " + nacionalidade;
    }
}

// Classe Principal
public class Main {
    public static void main(String[] args) {
        // Criando alguns compositores
        Compositor compositor1 = new Compositor("Ludwig van Beethoven", "Alemão");
        Compositor compositor2 = new Compositor("Wolfgang Amadeus Mozart", "Austríaco");

        // Criando algumas músicas com seus respectivos compositores
        Musica musica1 = new Musica("Für Elise", 1810, "Clássica", compositor1);
        Musica musica2 = new Musica("Sinfonia n.º 41", 1788, "Clássica", compositor2);
        Musica musica3 = new Musica("Symphony No. 5", 1808, "Clássica", compositor1);

        // Mostrando informações das músicas
        System.out.println(musica1);
        System.out.println("------------------------");
        System.out.println(musica2);
        System.out.println("------------------------");
        System.out.println(musica3);
    }
}
