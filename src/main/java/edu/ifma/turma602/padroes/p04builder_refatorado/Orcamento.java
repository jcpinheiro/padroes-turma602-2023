package edu.ifma.turma602.padroes.p04builder_refatorado;

import java.util.ArrayList;
import java.util.List;

public class Orcamento {
    private double valor;

    private List<Item> itens = new ArrayList<>();

    public void adiciona(Item item ) {
        itens.add(item );
    }

    public List<Item> getItens() {
        return itens;
    }

    public Orcamento(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public int getQuantidadeDeItens() {
        return getItens().size();
    }
}
