package questoes_5_a_11.comissoes;

public class ComissaoGerente extends Comissao {
    private static final double VALOR_COMISSAO = 1500.00;
    @Override
    public double getValor() {
        return VALOR_COMISSAO;
    }
}