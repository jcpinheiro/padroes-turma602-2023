package edu.ifma.turma602.roteiro02;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/*
  Nossa classe Divida deve armazenar o credor (para quem a empresa está devendo),
  o CNPJ desse credor, o valor total da dívida e o seu valor já pago
*/
public class Divida {

    private String credor;
    private String cnpjCredor;
    private double total;
    private double valorPago;

    private List<Pagamento> pagamentos = new ArrayList<>();


    public void registra(Pagamento pagamento) {
        pagamentos.add(pagamento );
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

        for(Pagamento pagamento: pagamentos  ) {
            if ( pagamento.getData().isBefore(data ) )
                pagamentosAnteriores.add(pagamento );
        }

        return pagamentosAnteriores;
    }

    public List<Pagamento> pagamentosComValorMenorQue(double valor ) {
        List<Pagamento> pagamentosValoresMenores = new ArrayList<>();

        for (Pagamento pagamento: pagamentos ) {
            if(pagamento.getValor() < valor )
                pagamentosValoresMenores.add(pagamento );
        }
        return  pagamentosValoresMenores;

    }


    public Divida(double total) {
        this.total = total;
    }

    public String getCredor() {
        return credor;
    }

    public void setCredor(String credor) {
        this.credor = credor;
    }

    public String getCnpjCredor() {
        return cnpjCredor;
    }

    public void setCnpjCredor(String cnpjCredor) {
        this.cnpjCredor = cnpjCredor;
    }

    public double getTotal() {
        return total;
    }

    public double getValorPago() {
        return valorPago;
    }



    @Override
    public String toString() {
        return "Divida{" +
                "credor='" + credor + '\'' +
                ", cnpjCredor='" + cnpjCredor + '\'' +
                ", total=" + total +
                ", valorPago=" + valorPago +
                '}';
    }


}
