package edu.ifma.turma602.padroes.p05decorator;

public class ICMS extends DecoradorDeImpostos {


    public ICMS() {   }

    public ICMS(Imposto outroImposto) {
        super(outroImposto);
    }

    @Override
    public double calcula(Orcamento orcamento ) {
        double icms = orcamento.getValor() * 0.10;

        if (this.outroImposto == null ) {
            return icms;

        } else {
            return icms + outroImposto.calcula(orcamento );
        }



    }
}
