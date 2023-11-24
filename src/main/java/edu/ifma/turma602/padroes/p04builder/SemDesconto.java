package edu.ifma.turma602.padroes.p04builder;

public class SemDesconto implements Desconto {
    @Override
    public double calculaDesconto(Orcamento orcamento) {
        return 0;
    }

    @Override
    public void setProximo(Desconto proximo) {
          throw new IllegalArgumentException("Ultima regra da cadeia de desconto!" );
    }
}
