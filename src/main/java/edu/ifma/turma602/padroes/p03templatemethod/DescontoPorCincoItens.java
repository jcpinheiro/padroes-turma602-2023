package edu.ifma.turma602.padroes.p03templatemethod;

public class DescontoPorCincoItens implements Desconto {

    private Desconto proximo;
    @Override
    public double calculaDesconto(Orcamento orcamento ) {

        // verifica primeira regra de possível desconto
        if(orcamento.getQuantidadeDeItens() > 5) {
            return orcamento.getValor() * 0.10;
        } else {
            return proximo.calculaDesconto(orcamento );
        }
    }

    @Override
    public void setProximo(Desconto proximo) {
        this.proximo = proximo;
    }

}
