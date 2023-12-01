package edu.ifma.turma602.padroes.p05decorator;

public class ISS extends DecoradorDeImpostos {

    private Imposto outroImposto;

    public ISS(Imposto outroImposto ) {
        this.outroImposto = outroImposto;
    }

    @Override
    public double calcula(Orcamento orcamento ) {
        double iss = orcamento.getValor() * 0.06;
        if (outroImposto == null )
           return iss;
        else {
            return iss + outroImposto.calcula(orcamento );
        }
    }
}
