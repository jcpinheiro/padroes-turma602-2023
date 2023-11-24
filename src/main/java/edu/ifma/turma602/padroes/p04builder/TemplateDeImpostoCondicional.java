package edu.ifma.turma602.padroes.p04builder;

public abstract class TemplateDeImpostoCondicional implements Imposto {


    @Override
    public final double calcula(Orcamento orcamento) {

        if(deveAplicarMaiorTaxaNo(orcamento ) )
            return aplicoAMaiorTaxaNo(orcamento);
        else
           return aplicoAMenorTaxaNo(orcamento);

    }

    protected abstract double aplicoAMenorTaxaNo(Orcamento orcamento);

    protected abstract double aplicoAMaiorTaxaNo(Orcamento orcamento);

    protected abstract boolean deveAplicarMaiorTaxaNo(Orcamento orcamento);
}
