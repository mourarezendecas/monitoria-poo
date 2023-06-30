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

    public String toString() {
        return "Rua " + rua + ", " + numero + " " + complemento + " - " + cep + " - " + bairro + " - " + cidade + "/" + estado;
    }
}

public class Empresa {
    private String cnpj;
    private String razaoSocial;
    private Endereco endereco;

    public Empresa(String cnpj, String razaoSocial, Endereco endereco) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.endereco = endereco;
    }

    public String toString() {
        return "Empresa: " + razaoSocial + " (CNPJ: " + cnpj + ")\nEndereço: " + endereco;
    }
}

public class Empregado {
    private String nome;
    private int matricula;
    private Empresa empresa;

    public Empregado(String nome, int matricula, Empresa empresa) {
        this.nome = nome;
        this.matricula = matricula;
        this.empresa = empresa;
    }

    public String toString() {
        return "Empregado: " + nome + " (Matrícula: " + matricula + ")\n" + empresa;
    }
}

public class Main {
    public static void main(String[] args) {
        // Criando o endereço da empresa
        Endereco enderecoEmpresa = new Endereco("Rua das Flores", 123, "Sala 1", "12345-678", "Centro", "São Paulo", "SP");

        // Criando a empresa
        Empresa empresa = new Empresa("12.345.678/0001-90", "Minha Empresa LTDA", enderecoEmpresa);

        // Criando os empregados
        Empregado empregado1 = new Empregado("João Silva", 12345, empresa);
        Empregado empregado2 = new Empregado("Maria Souza", 67890, empresa);

        // Mostrando as informações dos empregados
        System.out.println(empregado1);
        System.out.println();
        System.out.println(empregado2);
    }
}
