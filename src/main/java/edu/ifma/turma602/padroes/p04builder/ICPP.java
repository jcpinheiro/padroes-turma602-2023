package edu.ifma.turma602.padroes.p04builder;

class ICPP implements Imposto {

   @Override
    public double calcula(Orcamento orcamento) {

        if (orcamento.getValor() > 500) {
            return orcamento.getValor() * 0.07;

        } else {
            return orcamento.getValor() * 0.06;
        }
    }


}