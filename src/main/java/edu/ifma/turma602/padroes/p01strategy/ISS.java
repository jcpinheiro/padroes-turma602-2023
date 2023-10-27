package edu.ifma.turma602.padroes.p01strategy;

public class ISS {

    public double calculaISS(Orcamento orcamento ) {
        return orcamento.getValor() * 0.06;
    }
}
