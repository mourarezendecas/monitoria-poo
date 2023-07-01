package lista02.exercicio07;

public class Funcionario {

    protected String nome;
    protected String cpf;
    protected double salario;

    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "---Funcionario---\n" +
                "- Nome: " + nome + '\n' +
                "- CPF: '" + cpf + '\n' +
                "- Salario: R$" + salario + '\n';
    }

    public double bonificacao(){
        return salario*0.1;
    }

    public void aumentarSalario(Double aumento){
        salario = salario * aumento;
    }

    public double calcularProventos(){
        return (salario + bonificacao())*12;
    }
}
