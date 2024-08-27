package questoes_5_a_11;

import questoes_5_a_11.comissoes.ComissaoGerente;
import questoes_5_a_11.comissoes.ComissaoSupervisor;
import questoes_5_a_11.comissoes.ComissaoVendedor;
import questoes_5_a_11.funcionarios.Funcionario;
import questoes_5_a_11.funcionarios.FuncionarioBasico;
import questoes_5_a_11.funcionarios.FuncionarioGraduado;
import questoes_5_a_11.funcionarios.FuncionarioMedio;

public class EmpresaQuestao10_11 {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[10];

        int totalFuncionarios = funcionarios.length;
        int numGerentes = totalFuncionarios / 10;
        int numSupervisores = totalFuncionarios / 5;
        int numVendedores = totalFuncionarios - (numGerentes + numSupervisores);

        for (int i = 0; i < numGerentes; i++) {
            funcionarios[i] = new FuncionarioGraduado("Gerente" + (i + 1), 100 + i, "Escola Básica X", "Escola Média X", "Universidade X", new ComissaoGerente());
        }
        for (int i = numGerentes; i < numGerentes + numSupervisores; i++) {
            funcionarios[i] = new FuncionarioMedio("Supervisor" + (i + 1 - numGerentes), 100 + i, "Escola Básica X", "Escola Média X", new ComissaoSupervisor());
        }
        for (int i = numGerentes + numSupervisores; i < totalFuncionarios; i++) {
            funcionarios[i] = new FuncionarioBasico("Vendedor" + (i + 1 - numGerentes - numSupervisores), 100 + i, "Escola Básica X", new ComissaoVendedor());
        }

        double totalSalarios = 0.0;
        double totalBasico = 0.0;
        double totalMedio = 0.0;
        double totalGraduado = 0.0;

        for (Funcionario f : funcionarios) {
            double salario = f.calcularRenda();
            totalSalarios += salario;

            if (f instanceof FuncionarioGraduado) {
                totalGraduado += salario;
            } else if (f instanceof FuncionarioMedio) {
                totalMedio += salario;
            } else if (f instanceof FuncionarioBasico) {
                totalBasico += salario;
            }
            System.out.println(f);
        }

        System.out.println("\nCusto total com salários: R$ " + totalSalarios);
        System.out.println("Custo com funcionários de ensino básico: R$ " + totalBasico);
        System.out.println("Custo com funcionários de ensino médio: R$ " + totalMedio);
        System.out.println("Custo com funcionários de nível superior: R$ " + totalGraduado);
    }
}


