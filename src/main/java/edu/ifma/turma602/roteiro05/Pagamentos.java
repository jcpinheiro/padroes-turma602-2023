package edu.ifma.turma602.roteiro05;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class Pagamentos  {
    private double valorPago;

    private List<Pagamento> pagamentos = new ArrayList<>();

    public void registra(Pagamento pagamento) {
        this.pagamentos.add(pagamento );
        this.efetuaPagamento(pagamento.getValor() );
    }


    private void efetuaPagamento(double valor) {
        if (valor >= 500) {
            valor = valor - 8;
        }
        this.valorPago = this.valorPago + valor;
    }

    public List<Pagamento> pagamentosAntesDe(LocalDate data ) {

        List<Pagamento> pagamentosAnteriores = new ArrayList<>();

        for(Pagamento pagamento: this.pagamentos  ) {
            if ( pagamento.getData().isBefore(data ) )
                pagamentosAnteriores.add(pagamento );
        }

        return pagamentosAnteriores;
    }

    public List<Pagamento> pagamentosComValorMenorQue(double valor ) {
        List<Pagamento> pagamentosValoresMenores = new ArrayList<>();

        for (Pagamento pagamento: this.pagamentos ) {
            if(pagamento.getValor() < valor )
                pagamentosValoresMenores.add(pagamento );
        }
        return  pagamentosValoresMenores;

    }
    public double getValorPago() {
        return valorPago;
    }

    public boolean tem(Pagamento pagamento) {
        return this.pagamentos.contains(pagamento );
    }
}
