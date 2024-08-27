package questoes_5_a_11.funcionarios_cargos;

import questoes_5_a_11.comissoes.ComissaoSupervisor;
import questoes_5_a_11.funcionarios.Funcionario;

public class Supervisor extends Funcionario {
    public Supervisor(String nome, int codigoFuncional) {
        super(nome, codigoFuncional, new ComissaoSupervisor());
    }
}
