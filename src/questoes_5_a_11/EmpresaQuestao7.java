package questoes_5_a_11;

import questoes_5_a_11.funcionarios.*;
import questoes_5_a_11.comissoes.*;

public class EmpresaQuestao7 {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[10];

        funcionarios[1] = new FuncionarioMedio("Maria", 102, "Escola Pública", "Escola Média");
        funcionarios[2] = new FuncionarioMedio("Carlos", 103, "Escola Pública", "Escola Média");
        funcionarios[9] = new FuncionarioMedio("Carlos", 103, "Escola Pública", "Escola Média");
        funcionarios[8] = new FuncionarioMedio("Erika", 103, "Escola Pública", "Escola Média");
        funcionarios[3] = new FuncionarioBasico("Ana", 104, "Escola Pública");
        funcionarios[4] = new FuncionarioBasico("Pedro", 105, "Escola Pública");
        funcionarios[5] = new FuncionarioBasico("Paula", 106, "Escola Pública");
        funcionarios[6] = new FuncionarioBasico("Lucas", 107, "Escola Pública");
        funcionarios[7] = new FuncionarioGraduado("Ronaldo", 101, "Escola Pública", "Escola Média", "Universidade Federal");
        funcionarios[0] = new FuncionarioGraduado("João", 101, "Escola Pública", "Escola Média", "Universidade Federal");

        double totalSalarios = 0.0;
        double totalBasico = 0.0;
        double totalMedio = 0.0;
        double totalGraduado = 0.0;

        for (Funcionario funcionario : funcionarios) {
            double salario = funcionario.calcularRenda();
            totalSalarios += salario;

            if (funcionario instanceof FuncionarioGraduado) {
                totalGraduado += salario;
            } else if (funcionario instanceof FuncionarioMedio) {
                totalMedio += salario;
            } else if (funcionario instanceof FuncionarioBasico) {
                totalBasico += salario;
            }

            System.out.println(funcionario);
        }

        System.out.println("Custo total com salários: R$ " + totalSalarios);
        System.out.println("Custo com funcionários de ensino básico: R$ " + totalBasico);
        System.out.println("Custo com funcionários de ensino médio: R$ " + totalMedio);
        System.out.println("Custo com funcionários de nível superior: R$ " + totalGraduado);
    }
}
