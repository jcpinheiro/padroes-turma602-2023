package edu.ifma.turma602.padroes.p02chainofresponsability;

public class CalculadorDeDescontos {

  public double calcula(Orcamento orcamento) {

    // verifica primeira regra de possível desconto
    if(orcamento.getQuantidadeDeItens() > 5) {
      return orcamento.getValor() * 0.10;
    }
     
    // verifica segunda regra de possível desconto
    else if(orcamento.getValor() > 500.0) {
      return orcamento.getValor() * 0.07;
    }

    // verifica terceira, quarta, quinta regra de 
    // possível desconto  ...
    // um monte de ifs daqui pra baixo
    return 0;
  }
}
