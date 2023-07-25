import java.util.Scanner;
public class ControleRemoto {
    public static void main(String []args){
        Televisao tv1 = new Televisao();
        System.out.println("--------------COMANDOS--------------");
        System.out.println("    +/- : AUMENTA/DIMINUI o volume.");
        System.out.println("    >/< : PASSA/VOLTA o canal.");
        System.out.println("     *  : DESLIGA a televisao.");
        System.out.println("-------------------------------------\n\n");
        tv1.ligaDesliga();
        while(tv1.tvLigada){
            System.out.println(tv1);
            System.out.print("Insira o comando: ");
            Scanner sc = new Scanner(System.in);
            switch (sc.findInLine(".").charAt(0)) {
                case '+' -> tv1.aumentarVolume();
                case '-' -> tv1.reduzirVolume();
                case '>' -> tv1.passarCanal();
                case '<' -> tv1.voltarCanal();
                case '*' -> tv1.ligaDesliga();
                default -> System.out.println("Comando desconhecido!");
            }
        }
    }
}
