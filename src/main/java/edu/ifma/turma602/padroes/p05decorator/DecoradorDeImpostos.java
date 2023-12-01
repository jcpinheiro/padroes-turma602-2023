package edu.ifma.turma602.padroes.p05decorator;

public abstract class DecoradorDeImpostos implements Imposto {

    protected Imposto outroImposto;

    public DecoradorDeImpostos() {

    }

    public DecoradorDeImpostos(Imposto outroImposto ) {
        this.outroImposto = outroImposto;
    }


}
