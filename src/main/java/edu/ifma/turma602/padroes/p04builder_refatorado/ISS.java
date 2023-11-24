package edu.ifma.turma602.padroes.p04builder_refatorado;

public class ISS implements Imposto {

    @Override
    public double calcula(Orcamento orcamento ) {
        return orcamento.getValor() * 0.06;
    }
}
