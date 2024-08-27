package questoes_5_a_11.funcionarios_cargos;

import questoes_5_a_11.comissoes.Comissao;
import questoes_5_a_11.comissoes.ComissaoGerente;
import questoes_5_a_11.funcionarios.Funcionario;


public class Gerente extends Funcionario {
    public Gerente(String nome, int codigoFuncional) {
        super(nome, codigoFuncional, new ComissaoGerente());
    }
}