package questoes_5_a_11.funcionarios;

import questoes_5_a_11.comissoes.Comissao;

public class FuncionarioGraduado extends FuncionarioMedio {
    private String universidade;

    public FuncionarioGraduado(String nome, int codigoFuncional, String escolaBasica, String escolaMedia, String universidade) {
        super(nome, codigoFuncional, escolaBasica, escolaMedia);
        this.universidade = universidade;
    }
    public FuncionarioGraduado(String nome, int codigoFuncional, String escolaBasica, String escolaMedia, String universidade, Comissao comissao) {
        super(nome, codigoFuncional, escolaBasica, escolaMedia, comissao);
        this.universidade = universidade;
    }
    public String getUniversidade() {
        return universidade;
    }

    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }
    @Override
    public double calcularRenda() {
        return super.calcularRenda() * 2.00;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Universidade: " + universidade);
    }
}
