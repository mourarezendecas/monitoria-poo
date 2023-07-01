package lista02.exercicio05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Filme> filmes = new ArrayList<Filme>();
        Scanner scanner = new Scanner(System.in);

        int opt;

        do{
            int codigo;
            String nome;
            System.out.print("Digite o nome do filme: ");
            nome = scanner.nextLine();
            System.out.print("Digite o código do filme: ");
            codigo = scanner.nextInt();
            scanner.nextLine();

            Filme filme = new Filme(codigo, nome);

            System.out.print("Digite o genero do filme: ");
            filme.setGenero(scanner.nextLine());

            System.out.print("Digite o autor principal do filme: ");
            filme.setAutorPrincipal(scanner.nextLine());

            System.out.print("Digite o ano do filme: ");
            filme.setAno(scanner.nextInt());
            scanner.nextLine();


            System.out.println(filme);

            filmes.add(filme);

            System.out.println("---XXX---");
            System.out.println("Deseja criar mais um filme?");
            System.out.println("1 - Sim / 0 - Não");
            System.out.print("DIGITE: ");
            opt = scanner.nextInt();
        }
        while(opt!=0);

        Filme.getQtdFilmes();
    }
}
