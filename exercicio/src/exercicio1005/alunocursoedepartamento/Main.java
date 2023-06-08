package exercicio1005.alunocursoedepartamento;

public class Main {
    public static void main(String[] args) {
        Departamento departamento = new Departamento("Instituto de informatica", "INF");
        System.out.println(departamento.toString());

        Curso curso = new Curso("Sistemas de informação", "SI", departamento);
        System.out.println(curso.toString());

        Aluno aluno = new Aluno("Gabriel Rezende", 20200510, 2020, curso);
        System.out.println(aluno.toString());
    }
}
