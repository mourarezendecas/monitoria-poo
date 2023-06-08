package exercicio1005.empregadoempresa;

public class Empregado {
    private String nome;
    private int matricula;
    private Empresa empresa;

    public Empregado(String nome, int matricula, Empresa empresa) {
        this.nome = nome;
        this.matricula = matricula;
        this.empresa = empresa;
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

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "Empregado{" +
                "nome='" + nome + '\'' +
                ", matricula='" + matricula + '\'' +
                ", empresa=" + empresa +
                '}';
    }
}
