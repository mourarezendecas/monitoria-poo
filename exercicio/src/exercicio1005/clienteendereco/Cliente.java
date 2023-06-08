package exercicio1005.clienteendereco;

public class Cliente {
    private String nome;
    private String cpf;
    private Endereco end;

    public Cliente(String nome, String cpf, Endereco end) {
        this.nome = nome;
        this.cpf = cpf;
        this.end = end;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEnd() {
        return end;
    }

    public void setEnd(Endereco end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", end=" + end +
                '}';
    }
}
