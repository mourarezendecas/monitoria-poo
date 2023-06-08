package exercicio1005.alunocursoedepartamento;

public class Aluno {
    private String nome;
    private int matricula;
    private int ano;
    private Curso curso;

    public Aluno(String nome, int matricula, int ano, Curso curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.ano = ano;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", ano=" + ano +
                ", curso=" + curso +
                '}';
    }
}
