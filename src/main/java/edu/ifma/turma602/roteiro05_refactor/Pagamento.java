package edu.ifma.turma602.roteiro05_refactor;

import java.time.LocalDate;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pagamento pagamento = (Pagamento) o;
        return Double.compare(pagamento.valor, valor) == 0 && Objects.equals(pagador, pagamento.pagador) && Objects.equals(data, pagamento.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pagador, data, valor);
    }
}
