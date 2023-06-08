package exercicio1005.musicaecompositores;

public class Musica {
    private String nome;
    private int ano;
    private Compositor compositor;

    public Musica(String nome, int ano, Compositor compositor) {
        this.nome = nome;
        this.ano = ano;
        this.compositor = compositor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Compositor getCompositor() {
        return compositor;
    }

    public void setCompositor(Compositor compositor) {
        this.compositor = compositor;
    }

    @Override
    public String toString() {
        return "Musica{" +
                "nome='" + nome + '\'' +
                ", ano=" + ano +
                ", compositor=" + compositor +
                '}';
    }
}
