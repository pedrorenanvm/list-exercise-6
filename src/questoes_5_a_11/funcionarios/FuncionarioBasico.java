package questoes_5_a_11.funcionarios;

import questoes_5_a_11.comissoes.Comissao;

public class FuncionarioBasico extends Funcionario {
    private String escolaBasica;

    public FuncionarioBasico(String nome, int codigoFuncional, String escolaBasica) {
        super(nome, codigoFuncional, null);
        this.escolaBasica = escolaBasica;
    }

    public FuncionarioBasico(String nome, int codigoFuncional, String escolaBasica, Comissao comissao) {
        super(nome, codigoFuncional, comissao);
        this.escolaBasica = escolaBasica;
    }

    public String getEscolaBasica() {
        return escolaBasica;
    }

    public void setEscolaBasica(String escolaBasica) {
        this.escolaBasica = escolaBasica;
    }

    @Override
    public String toString() {
        return super.toString() + ", Escola Básica: " + escolaBasica;
    }
}
