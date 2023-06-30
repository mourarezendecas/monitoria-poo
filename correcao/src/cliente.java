public class Cliente {
    private String nome;
    private String cpf;
    private Endereco endereco;

    public Cliente(String nome, String cpf, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nCPF: " + cpf + "\nEndereço: " + endereco + "\n";
    }
}

public class Endereco {
    private String rua;
    private int numero;
    private String complemento;
    private String cep;
    private String bairro;
    private String cidade;
    private String estado;

    public Endereco(String rua, int numero, String complemento, String cep, String bairro, String cidade, String estado) {
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return rua + ", " + numero + " " + complemento + " - " + bairro + ", " + cidade + "/" + estado + " - CEP: " + cep;
    }
}

public class Main {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Rua A", 123, "", "12345-678", "Bairro A", "Cidade A", "Estado A");
        Cliente cliente1 = new Cliente("João", "123.456.789-00", endereco1);

        Endereco endereco2 = new Endereco("Rua B", 456, "Apto 101", "98765-432", "Bairro B", "Cidade B", "Estado B");
        Cliente cliente2 = new Cliente("Maria", "987.654.321-00", endereco2);

        System.out.println(cliente1);
        System.out.println(cliente2);
    }
}
