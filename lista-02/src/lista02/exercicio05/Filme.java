package lista02.exercicio05;

public class Filme {
    private int codigo;
    private String nome;
    private String genero;
    private int ano;
    private String autorPrincipal;

    static int qtdFilmes = 0;

    public Filme(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        qtdFilmes ++;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getAutorPrincipal() {
        return autorPrincipal;
    }

    public void setAutorPrincipal(String autorPrincipal) {
        this.autorPrincipal = autorPrincipal;
    }

    @Override
    public String toString() {
        return "---F I L M E---\n" +
                "Nome: " + nome + "\n" +
                "Genero: " + genero + "\n" +
                "Ano: " + ano + "\n" +
                "Autor principal: " + autorPrincipal + "\n"+
                "Código: " + codigo;
    }

    static void getQtdFilmes(){
        System.out.println("QUANTIDADES DE FILMES CADASTRADOS: " +qtdFilmes);
    }
}
