package lista02.exercicio06;

public class Cd extends Item{

    private String artista;
    private int quantidadeDeFaixas;
    public Cd(String titulo, int ano, int tempoDeDuracao, String comentarios, String artista, int quantidadeDeFaixas) {
        super(titulo, ano, tempoDeDuracao, comentarios);
        this.artista = artista;
        this.quantidadeDeFaixas = quantidadeDeFaixas;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getQuantidadeDeFaixas() {
        return quantidadeDeFaixas;
    }

    public void setQuantidadeDeFaixas(int quantidadeDeFaixas) {
        this.quantidadeDeFaixas = quantidadeDeFaixas;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Artista: " + artista);
        System.out.println("Quantidade de faixas: " + quantidadeDeFaixas);
    }
}
