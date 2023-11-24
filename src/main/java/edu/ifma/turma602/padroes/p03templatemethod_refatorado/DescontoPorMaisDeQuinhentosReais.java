package edu.ifma.turma602.padroes.p03templatemethod_refatorado;

public class DescontoPorMaisDeQuinhentosReais implements Desconto {

    private Desconto proximo;

    @Override
    public double calculaDesconto(Orcamento orcamento ) {

        if (orcamento.getValor() > 500.0) {
            return orcamento.getValor() * 0.07;
        } else {
            return proximo.calculaDesconto(orcamento );
        }
    }

    @Override
    public void setProximo(Desconto proximo) {
        this.proximo = proximo;
    }

}
