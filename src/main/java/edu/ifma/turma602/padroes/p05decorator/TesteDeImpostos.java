package edu.ifma.turma602.padroes.p05decorator;

public class TesteDeImpostos {
 
  public static void main(String[] args) {

      Imposto iss = new ICMS(new ISS(new ICPP()) );
 
      Orcamento orcamento = new Orcamento(500.0);
 
      double valor = iss.calcula(orcamento);
       
      System.out.println(valor);
  }
}
