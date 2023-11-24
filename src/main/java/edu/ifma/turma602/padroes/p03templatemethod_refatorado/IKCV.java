package edu.ifma.turma602.padroes.p03templatemethod_refatorado;

class IKCV extends TemplateDeImpostoCondicional {

    @Override
    protected boolean deveAplicarMaiorTaxaNo(Orcamento orcamento) {
        return (orcamento.getValor() > 500 &&  temItemMaiorQue100ReaisNo(orcamento));
    }

    @Override
    protected final double aplicoAMenorTaxaNo(Orcamento orcamento) {
        return orcamento.getValor() * 0.05;
    }

    @Override
    protected final double aplicoAMaiorTaxaNo(Orcamento orcamento) {
        return orcamento.getValor() * 0.12;
    }


    private final boolean temItemMaiorQue100ReaisNo(Orcamento orcamento) {
        for (Item item : orcamento.getItens()) {
            if (item.getValor() > 100) return true;
        }

        return false;
    }

}