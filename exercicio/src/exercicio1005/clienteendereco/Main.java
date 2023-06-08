package exercicio1005.clienteendereco;

public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco(
          "Dona Stela",
          269,
          "Negrão de lima",
          "Portal das Paineiras",
          "Goiânia",
          "Goiás"
        );
        System.out.println(endereco.toString());

        Cliente cliente = new Cliente("Gabriel Rezende", "70069938148", endereco);
        System.out.println(cliente.toString());
    }
}
