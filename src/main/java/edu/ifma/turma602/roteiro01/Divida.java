package edu.ifma.turma602.roteiro01;

import java.util.ArrayList;

/*
  Nossa classe Divida deve armazenar o credor (para quem a empresa está devendo),
  o CNPJ desse credor, o valor total da dívida e o seu valor já pago
*/
public class Divida {

    private String credor;
    private String cnpjCredor;
    private double total;
    private double valorPago;


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

    public void efetuaPagamento(double valor) {
        if (valor >= 500) {
            valor = valor - 8;
        }
        this.valorPago = this.valorPago + valor;
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
