package questoes_5_a_11.funcionarios_cargos;

import questoes_5_a_11.comissoes.ComissaoVendedor;
import questoes_5_a_11.funcionarios.Funcionario;

public class Vendedor extends Funcionario {
    public Vendedor(String nome, int codigoFuncional) {
        super(nome, codigoFuncional, new ComissaoVendedor());
    }
}