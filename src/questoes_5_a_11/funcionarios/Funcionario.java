package questoes_5_a_11.funcionarios;

import questoes_5_a_11.comissoes.Comissao;

public class Funcionario {
    private String nome;
    private int codigoFuncional;
    private double rendaBasica;
    private Comissao comissao;

    public Funcionario(String nome, int codigoFuncional, double rendaBasica) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
        this.rendaBasica = rendaBasica;
    }

    public Funcionario(String nome, int codigoFuncional, Comissao comissao) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
        this.rendaBasica = 1000.00;
        this.comissao = comissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigoFuncional() {
        return codigoFuncional;
    }

    public void setCodigoFuncional(int codigoFuncional) {
        this.codigoFuncional = codigoFuncional;
    }

    public double getRendaBasica() {
        return rendaBasica;
    }

    public void setRendaBasica(double rendaBasica) {
        this.rendaBasica = rendaBasica;
    }

    public double calcularRenda() {
        return rendaBasica + (comissao != null ? comissao.getValor() : 0);
    }

    @Override
    public String toString() {
        double comissaoValor = comissao != null ? comissao.getValor() : 0;
        return "Nome: " + nome + ", Comissão: R$ " + comissaoValor + ", Salário Total: R$ " + calcularRenda();
    }
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Código Funcional: " + codigoFuncional);
        System.out.println("Renda Total: R$ " + calcularRenda());
    }
}
