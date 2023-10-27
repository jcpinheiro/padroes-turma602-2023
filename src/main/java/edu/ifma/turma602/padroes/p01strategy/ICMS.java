package edu.ifma.turma602.padroes.p01strategy;

public class ICMS {

    public double calculaICMS(Orcamento orcamento ) {
        return orcamento.getValor() * 0.10;
    }
}
