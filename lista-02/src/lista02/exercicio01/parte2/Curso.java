package lista02.exercicio01.parte2;

public class Curso {
    private String sigla;

    public Curso(String sigla) {
        this.sigla = sigla;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "sigla='" + sigla + '\'' +
                '}';
    }
}
