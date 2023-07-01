package lista02.exercicio07;

public class Vendedor extends Funcionario{
    private double comissao;
    private int[] vendas = new int[12];

    public Vendedor(String nome, String cpf, double salario, double comissao, int[] vendas) {
        super(nome, cpf, salario);
        this.comissao = comissao;
        this.vendas = vendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public int[] getVendas() {
        return vendas;
    }

    public void setVendas(int[] vendas) {
        this.vendas = vendas;
    }
}
