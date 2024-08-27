package questoes_5_a_11.funcionarios;

import questoes_5_a_11.comissoes.Comissao;

public class FuncionarioMedio extends FuncionarioBasico {
    private String escolaMedia;

    public FuncionarioMedio(String nome, int codigoFuncional, String escolaBasica, String escolaMedia) {
        super(nome, codigoFuncional, escolaBasica);
        this.escolaMedia = escolaMedia;
    }

    public FuncionarioMedio(String nome, int codigoFuncional, String escolaBasica, String escolaMedia, Comissao comissao) {
        super(nome, codigoFuncional, escolaBasica, comissao);
        this.escolaMedia = escolaMedia;
    }

    public String getEscolaMedia() {
        return escolaMedia;
    }

    public void setEscolaMedia(String escolaMedia) {
        this.escolaMedia = escolaMedia;
    }

    @Override
    public double calcularRenda() {
        return super.calcularRenda() * 1.50;
    }
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Escola Média: " + escolaMedia);
    }
}
