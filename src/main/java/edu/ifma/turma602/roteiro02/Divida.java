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

    private final Pagamentos historicoPagamentos = new Pagamentos();

    public Divida(double total) {
        this.total = total;
    }

    public void registra(Pagamento pagamento) {
        historicoPagamentos.registra(pagamento);
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

    public double saldoDevedor() {
        return this.total - historicoPagamentos.getValorPago();
    }

    @Override
    public String toString() {
        return "Divida{" +
                "credor='" + credor + '\'' +
                ", cnpjCredor='" + cnpjCredor + '\'' +
                ", total=" + total +
                ", valorPago=" + historicoPagamentos.getValorPago() +
                '}';
    }


}
