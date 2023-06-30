package lista02.exercicio01.parte2;


public class Main {
    public static void main(String[] args) {
        lista02.exercicio01.parte2.Aluno aluno = new Aluno("Gabriel Rezende");

        Curso cursoCienciaDaComputacao = new Curso("CC");

        aluno.matricular(202000510, cursoCienciaDaComputacao, 2018);

        System.out.println(aluno.toString());

        Curso cursoSistemasDeInformacao = new Curso("SI");

        aluno.setCurso(cursoSistemasDeInformacao);

        aluno.setAno(2020);

        System.out.println(aluno.toString());
    }
}
