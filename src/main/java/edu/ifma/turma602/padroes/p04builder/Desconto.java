package edu.ifma.turma602.padroes.p04builder;

public interface Desconto {
    public double calculaDesconto(Orcamento orcamento );
    public void setProximo(Desconto proximo );

}
