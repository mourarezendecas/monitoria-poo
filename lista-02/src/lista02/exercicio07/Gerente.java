package lista02.exercicio07;

public class Gerente extends Funcionario{
    private String senha;

    public Gerente(String nome, String cpf, double salario, String senha) {
        super(nome, cpf, salario);
        this.senha = senha;
    }

    @Override
    public double bonificacao(){
        return salario * .15;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "---Gerente---\n" +
                "- Nome: " + nome + '\n' +
                "- CPF: '" + cpf + '\n' +
                "- Salario: R$" + salario + '\n'+
                "- Senha: " + senha;
    }
}
