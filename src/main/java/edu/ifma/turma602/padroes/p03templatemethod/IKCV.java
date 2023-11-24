package edu.ifma.turma602.padroes.p03templatemethod;

class IKCV implements Imposto {

    @Override
    public double calcula(Orcamento orcamento) {

        if (orcamento.getValor() > 500 &&  temItemMaiorQue100ReaisNo(orcamento)) {
            return orcamento.getValor() * 0.12;
        } else {
            return orcamento.getValor() * 0.05;
        }
    }



    private boolean temItemMaiorQue100ReaisNo(Orcamento orcamento) {
        for (Item item : orcamento.getItens()) {
            if (item.getValor() > 100) return true;
        }

        return false;
    }
}