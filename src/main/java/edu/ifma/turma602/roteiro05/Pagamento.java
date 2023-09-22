package edu.ifma.turma602.roteiro05;

import java.time.LocalDate;

public class Pagamento {

    private String pagador;
    private LocalDate data;
    private double valor;


    public String getPagador() {
        return pagador;
    }


    public void setPagador(String pagador) {
        this.pagador = pagador;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }


    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

}
