package lista02.exercicio02;

public class CadastroMultiplo {
    public static void main(String[] args) {

        Cliente[] cliente = new Cliente[5];

        cliente[0] = new Cliente("Maria");
        cliente[0].setIdade(20);
        cliente[0].setTelefone("999-8899");

        cliente[1] = new Cliente("João");
        cliente[1].setIdade(25);
        cliente[1].setTelefone("888-7788");

        cliente[2] = new Cliente("Ana");
        cliente[2].setIdade(30);
        cliente[2].setTelefone("777-6677");

        cliente[3] = new Cliente("Pedro");
        cliente[3].setIdade(35);
        cliente[3].setTelefone("666-5566");

        cliente[4] = new Cliente("Laura");
        cliente[4].setIdade(40);
        cliente[4].setTelefone("555-4455");

        /* complete aqui  */

        for (int i=0;i<cliente.length;i++) {
            System.out.println(cliente[i]);

        }
    }
}
