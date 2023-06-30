public class Departamento {
    private String nome;
    private String sigla;

    public Departamento(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "nome='" + nome + '\'' +
                ", sigla='" + sigla + '\'' +
                '}';
    }
}

public class Curso {
    private String nome;
    private String sigla;
    private Departamento departamento;

    public Curso(String nome, String sigla, Departamento departamento) {
        this.nome = nome;
        this.sigla = sigla;
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", sigla='" + sigla + '\'' +
                ", departamento=" + departamento +
                '}';
    }
}

public class Aluno {
    private String nome;
    private String matricula;
    private int ano;
    private Curso curso;

    public Aluno(String nome, String matricula, int ano, Curso curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.ano = ano;
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula='" + matricula + '\'' +
                ", ano=" + ano +
                ", curso=" + curso +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        // Criando departamentos
        Departamento dep1 = new Departamento("Ciências da Computação", "CC");
        Departamento dep2 = new Departamento("Engenharia Elétrica", "EE");

        // Criando cursos
        Curso curso1 = new Curso("Sistemas de Informação", "SI", dep1);
        Curso curso2 = new Curso("Engenharia de Computação", "EC", dep1);
        Curso curso3 = new Curso("Engenharia Elétrica", "EE", dep2);

        // Criando alunos
        Aluno aluno1 = new Aluno("João", "1234", 2022, curso1);
        Aluno aluno2 = new Aluno("Maria", "5678", 2021, curso2);
        Aluno aluno3 = new Aluno("Pedro", "9012", 2020, curso3);

        // Mostrando os objetos criados
        System.out.println(aluno1);
        System.out.println(aluno2);
        System.out.println(aluno3);
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(curso3);
        System.out.println(dep1);
        System.out.println(dep2);
    }
}
