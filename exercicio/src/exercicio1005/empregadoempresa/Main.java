package exercicio1005.empregadoempresa;

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
        System.out.println(endereco);

        Empresa empresa = new Empresa("/00001-78", "CODIGOS LIMPOS S/A");

        Empregado empregado1 = new Empregado("Gabriel Rezende", 2022, empresa);
        System.out.println(empregado1.toString());
        Empregado empregado2 = new Empregado("Andreia Gomes", 2023, empresa);
        System.out.println(empregado2.toString());

        empresa.addEmpregados(empregado1);
        empresa.addEmpregados(empregado2);
        System.out.println(empresa);

    }
}
