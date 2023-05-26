package lista02.exercicio06;

public abstract class Item {
    private String titulo;
    private int ano;
    private int tempoDeDuracao;
    private String comentarios;

    public Item(String titulo, int ano, int tempoDeDuracao, String comentarios) {
        this.titulo = titulo;
        this.ano = ano;
        this.tempoDeDuracao = tempoDeDuracao;
        this.comentarios = comentarios;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getTempoDeDuracao() {
        return tempoDeDuracao;
    }

    public void setTempoDeDuracao(int tempoDeDuracao) {
        this.tempoDeDuracao = tempoDeDuracao;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public void mostrarDados() {
        System.out.println("Título: " + titulo);
        System.out.println("Ano: " + ano);
        System.out.println("Duração: " + tempoDeDuracao + " minutos");
        System.out.println("Comentários: " + comentarios);
    }
}
