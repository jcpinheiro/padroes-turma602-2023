package edu.ifma.turma602.padroes.p04builder;

public class ICMS implements Imposto {

    @Override
    public double calcula(Orcamento orcamento ) {
        return orcamento.getValor() * 0.10;
    }
}
