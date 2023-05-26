package lista02.exercicio06;

public class Jogo extends Item{

    private int numeroDeJogadores;
    private String plataforma;

    public Jogo(String titulo, int ano, int tempoDeDuracao, String comentarios, int numeroDeJogadores, String plataforma) {
        super(titulo, ano, tempoDeDuracao, comentarios);
        this.numeroDeJogadores = numeroDeJogadores;
        this.plataforma = plataforma;
    }

    public int getNumeroDeJogadores() {
        return numeroDeJogadores;
    }

    public void setNumeroDeJogadores(int numeroDeJogadores) {
        this.numeroDeJogadores = numeroDeJogadores;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public void mostrarDados(){
        super.mostrarDados();
        System.out.println("Numero de jogadores: " + numeroDeJogadores);
        System.out.println("Plataforma: " + plataforma);
    }
}
