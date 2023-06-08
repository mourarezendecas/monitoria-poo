package exercicio1005.empregadoempresa;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String cnpj;
    private String razao;
    private static final List<Empregado> empregados = new ArrayList<>();

    public Empresa(String cnpj, String razao) {
        this.cnpj = cnpj;
        this.razao = razao;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazao() {
        return razao;
    }

    public void setRazao(String razao) {
        this.razao = razao;
    }

    public List<Empregado> getEmpregados() {
        return empregados;
    }

    public void addEmpregados(Empregado empregado) {
        empregados.add(empregado);
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "cnpj='" + cnpj + '\'' +
                ", razao='" + razao + '\'' +
                '}';
    }
}
