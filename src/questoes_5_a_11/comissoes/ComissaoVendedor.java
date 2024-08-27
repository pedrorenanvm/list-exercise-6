package questoes_5_a_11.comissoes;

public class ComissaoVendedor extends Comissao {
    private static final double VALOR_COMISSAO = 250.00;
    @Override
    public double getValor() {
        return VALOR_COMISSAO;
    }
}