package edu.ifma.turma602.padroes.p01strategy;

public class CalculadorDeImpostos {

    // versao 02
    public void realizaCalculo(Orcamento orcamento, String imposto) {

        if (imposto.equalsIgnoreCase("ICMS")) {
            double icms = new ICMS().calculaICMS(orcamento );
            System.out.println(icms);

        } else if (imposto.equalsIgnoreCase("ISS") ) {
            double iss = new ISS().calculaISS(orcamento );
            System.out.println(iss);

            // if else ...

        } else {
            System.out.println("Imposto Inválido!");
        }

    }

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
