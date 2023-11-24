package edu.ifma.turma602.padroes.p03templatemethod_refatorado;

class ICPP extends TemplateDeImpostoCondicional {

    @Override
    protected boolean deveAplicarMaiorTaxaNo(Orcamento orcamento) {
        return orcamento.getValor() > 500;
    }

    @Override
    protected double aplicoAMenorTaxaNo(Orcamento orcamento) {
        return orcamento.getValor() * 0.06;
    }

    @Override
    protected double aplicoAMaiorTaxaNo(Orcamento orcamento) {
        return orcamento.getValor() * 0.07;
    }

}
