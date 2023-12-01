package edu.ifma.turma602.padroes.p05decorator;

public class CalculadorDeDescontos {

  public double calcula(Orcamento orcamento, Desconto desconto) {

    desconto.calculaDesconto(orcamento );


  /*  // verifica primeira regra de possível desconto
    if(orcamento.getQuantidadeDeItens() > 5) {
      return new DescontoPorCincoItens().desconta(orcamento );
    }
     
    // verifica segunda regra de possível desconto
    else if(orcamento.getValor() > 500.0) {
      return new DescontoPorMaisDeQuinhentosReais().desconta(orcamento);
    }*/

    // verifica terceira, quarta, quinta regra de 
    // possível desconto  ...
    // um monte de ifs daqui pra baixo

    return 0;
  }
}
