package lista02.exercicio01.parte1;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Gabriel Rezende");

        aluno.matricular(202000510, "Ciências da computação", 2018);

        System.out.println(aluno.toString());

        aluno.setCurso("Sistemas de informação");

        aluno.setAno(2020);

        System.out.println(aluno.toString());
    }
}
