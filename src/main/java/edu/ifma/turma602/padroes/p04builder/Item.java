package edu.ifma.turma602.padroes.p04builder;

public class Item {
    private double valor;
    private int quantidade;


    public Item(double valor, int quantidade) {
        this.valor = valor;
        this.quantidade = quantidade;
    }


    public double getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }


    double getSubTotal() {
        return valor * quantidade;
    }
}
