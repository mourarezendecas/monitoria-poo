package lista02.exercicio07;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String cpnj;
    private String nome;
    private List<Funcionario> funcionarios = new ArrayList<Funcionario>();

    public Empresa(String cpnj, String nome) {
        this.cpnj = cpnj;
        this.nome = nome;
    }

    public String getCpnj() {
        return cpnj;
    }

    public void setCpnj(String cpnj) {
        this.cpnj = cpnj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void adicionarFuncionarios(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
    }

    public void mostrarFuncionarios(){
        System.out.println("--- LISTA DE FUNCIONARIOS ---");
        for(Funcionario funcionario : funcionarios){
            System.out.println(funcionario.toString());
        }
    }
}
