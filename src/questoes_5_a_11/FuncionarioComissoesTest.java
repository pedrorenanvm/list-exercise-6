package questoes_5_a_11;

import questoes_5_a_11.comissoes.ComissaoGerente;
import questoes_5_a_11.comissoes.ComissaoSupervisor;
import questoes_5_a_11.comissoes.ComissaoVendedor;
import questoes_5_a_11.funcionarios.Funcionario;


public class FuncionarioComissoesTest {

    public static void main(String[] args) {
        Funcionario gerente = new Funcionario("Carlos", 201, new ComissaoGerente());
        Funcionario supervisor = new Funcionario("Ana", 202, new ComissaoSupervisor());
        Funcionario vendedor = new Funcionario("João", 203, new ComissaoVendedor());
        Funcionario semComissao = new Funcionario("Lucas", 204, null);  // Funcionario sem comissão

        gerente.exibirInformacoes();
        System.out.println();

        supervisor.exibirInformacoes();
        System.out.println();

        vendedor.exibirInformacoes();
        System.out.println();

        semComissao.exibirInformacoes();
    }
}

