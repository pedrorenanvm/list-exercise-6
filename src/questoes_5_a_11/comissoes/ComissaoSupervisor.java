package questoes_5_a_11.comissoes;

public class ComissaoSupervisor extends Comissao {
    private static final double VALOR_COMISSAO = 600.00;

    @Override
    public double getValor() {
        return VALOR_COMISSAO;
    }
}