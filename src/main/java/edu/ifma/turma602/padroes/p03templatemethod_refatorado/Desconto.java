package edu.ifma.turma602.padroes.p03templatemethod_refatorado;

public interface Desconto {
    public double calculaDesconto(Orcamento orcamento );
    public void setProximo(Desconto proximo );

}
