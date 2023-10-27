package edu.ifma.turma602.padroes.p02chainofresponsability_refatorado;

public interface Desconto {
    public double calculaDesconto(Orcamento orcamento );
    public void setProximo(Desconto proximo );

}
