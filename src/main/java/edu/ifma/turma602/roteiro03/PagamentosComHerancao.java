package edu.ifma.turma602.roteiro03;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class PagamentosComHerancao extends ArrayList<Pagamento> {
    private double valorPago;

    // private List<Pagamento> pagamentos = new ArrayList<>();

    public void registra(Pagamento pagamento) {
        this.add(pagamento );
        this.efetuaPagamento(pagamento.getValor() );
    }

    @Override
    public boolean add(Pagamento pagamento) {
        this.registra(pagamento );
        return true;
    }

    @Override
    public void clear() {
        throw new RuntimeException("A lista não pode ser removida");
    }

    private void efetuaPagamento(double valor) {
        if (valor >= 500) {
            valor = valor - 8;
        }
        this.valorPago = this.valorPago + valor;
    }

    public List<Pagamento> pagamentosAntesDe(LocalDate data ) {

        List<Pagamento> pagamentosAnteriores = new ArrayList<>();

        for(Pagamento pagamento: this  ) {
            if ( pagamento.getData().isBefore(data ) )
                pagamentosAnteriores.add(pagamento );
        }

        return pagamentosAnteriores;
    }

    public List<Pagamento> pagamentosComValorMenorQue(double valor ) {
        List<Pagamento> pagamentosValoresMenores = new ArrayList<>();

        for (Pagamento pagamento: this ) {
            if(pagamento.getValor() < valor )
                pagamentosValoresMenores.add(pagamento );
        }
        return  pagamentosValoresMenores;

    }
    public double getValorPago() {
        return valorPago;
    }

}
