package edu.ifma.turma602.padroes.p01strategy_refatorado;

public class CalculadorDeImpostos {

    // versao 03
    public void realizaCalculo(Orcamento orcamento, Imposto imposto) {
        double valorDoImposto = imposto.calcula(orcamento);
        System.out.println(valorDoImposto );

    }

 /*   // versao 02
    public void realizaCalculo(Orcamento orcamento, String imposto) {

        if (imposto.equalsIgnoreCase("ICMS")) {
            double icms = new ICMS().calcula(orcamento );
            System.out.println(icms);

        } else if (imposto.equalsIgnoreCase("ISS") ) {
            double iss = new ISS().calcula(orcamento );
            System.out.println(iss);

        // if else ...

        } else {
            System.out.println("Imposto Inválido!");
        }

    }*/

/*  // versão 01
    public void realizaCalculo(Orcamento orcamento, String imposto) {

        if (imposto.equalsIgnoreCase("ICMS")) {
            double icms = orcamento.getValor() * 0.10;
            System.out.println(icms);

        } else if (imposto.equalsIgnoreCase("ISS") ) {
            double iss = orcamento.getValor() * 0.06;
            System.out.println(iss);

       // if else ...

        } else {
            System.out.println("Imposto Inválido!");
        }

    }
*/
}
