package lista02.exercicio06;

public class Filme extends Item{

    private String diretor;

    public Filme(String titulo, int ano, int tempoDeDuracao, String comentarios, String diretor) {
        super(titulo, ano, tempoDeDuracao, comentarios);
        this.diretor = diretor;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public void mostrarDados(){
        super.mostrarDados();
        System.out.println("Diretor: " + diretor);
    }
}
