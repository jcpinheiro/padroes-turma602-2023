package edu.ifma.turma602.padroes.p03templatemethod_refatorado;

public class Item {
    private double valor;
    private int quantidade;
    private String nome;


    public Item(String nome, double valor, int quantidade) {
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
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
