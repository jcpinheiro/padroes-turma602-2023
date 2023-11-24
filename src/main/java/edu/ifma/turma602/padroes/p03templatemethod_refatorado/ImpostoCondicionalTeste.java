package edu.ifma.turma602.padroes.p03templatemethod_refatorado;

public class ImpostoCondicionalTeste {

    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento(500);

        Item item1 = new Item("Pen drive", 100, 2);
        Item item2 = new Item("HD externo", 300, 1);

        orcamento.adiciona(item1);
        orcamento.adiciona(item2);

        Imposto icpp = new ICPP();

        CalculadorDeImpostos calculadorDeImpostos = new CalculadorDeImpostos();

        calculadorDeImpostos.realizaCalculo(orcamento, icpp );


    }
}
