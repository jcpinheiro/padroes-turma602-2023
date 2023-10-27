package edu.ifma.turma602.roteiro06;

/*
  Nossa classe Divida deve armazenar o credor (para quem a empresa está devendo),
  o CNPJ desse credor, o valor total da dívida e o seu valor já pago
*/
public class Divida {

    private String credor;

    private Documento documentoCredor;
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

    public Documento getDocumentoCredor() {
        return documentoCredor;
    }

    public void setDocumentoCredor(Documento documentoCredor) {
        this.documentoCredor = documentoCredor;
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
                ", documentoCredor='" + documentoCredor + '\'' +
                ", total=" + total +
                ", valorPago=" + historicoPagamentos.getValorPago() +
                '}';
    }


}
