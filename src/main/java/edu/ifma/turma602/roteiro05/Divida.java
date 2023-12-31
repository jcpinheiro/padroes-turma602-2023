package edu.ifma.turma602.roteiro05;

import java.util.List;

/*
  Nossa classe Divida deve armazenar o credor (para quem a empresa está devendo),
  o CNPJ desse credor, o valor total da dívida e o seu valor já pago
*/
public class Divida {

    private String credor;
    private CNPJ cnpjCredor;
    private CPF cpfCredor;
    private double total;

    private String telefone;

    private final Pagamentos historicoPagamentos = new Pagamentos();

    public Divida(double total) {
        this.total = total;
    }

    public void registra(Pagamento pagamento) {
        historicoPagamentos.registra(pagamento);
    }

    public Iterable<Pagamento> getPagamentos() {
        Iterable<Pagamento> pagamentos = historicoPagamentos.getPagamentos();

        return pagamentos;

    }

    public boolean jaFoiRealizadoO(Pagamento pagamento) {
        return this.historicoPagamentos.tem(pagamento );
    }


    public String getCredor() {
        return credor;
    }

    public void setCredor(String credor) {
        this.credor = credor;
    }

    public CNPJ getCnpjCredor() {
         return cnpjCredor;
    }

    public void setCnpjCredor(CNPJ cnpjCredor) {
        if (cpfCredor == null)
            this.cnpjCredor = cnpjCredor;
        else
            throw new IllegalStateException("Erro! A divida já foi associada a um CNPJ");
    }

    public CPF getCpfCredor() {
        return cpfCredor;
    }

    public void setCpfCredor(CPF cpfCredor) {
        if (cnpjCredor == null )
            this.cpfCredor = cpfCredor;
        else
            throw new IllegalStateException("Erro! A divida já foi associada a um CPF");
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
