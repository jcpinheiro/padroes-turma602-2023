package edu.ifma.turma602.padroes.p05decorator;

import java.time.LocalDate;
import java.util.List;

public class NotaFiscalBuilder {

    private final NotaFiscal notaFiscal = new NotaFiscal();


    public NotaFiscalBuilder paraEmpresa(String nome) {
        notaFiscal.setRazaoSocial(nome );
        return this;
    }

    public NotaFiscalBuilder comCNPJ(String cnpj ) {
        notaFiscal.setCnpj(cnpj );
        return this;

    }

    public NotaFiscalBuilder naDataAtual() {
        notaFiscal.setDataDeEmissao(LocalDate.now() );
        return this;
    }

    public NotaFiscalBuilder adiciona(List<Item> itens) {
        notaFiscal.setItens(itens );
        double valorTotal = 0;

        for(Item item : itens) {
            valorTotal += item.getSubTotal();
        }
        double impostos = valorTotal * 0.05;

        notaFiscal.setImpostos(impostos );

        return this;
    }

    public NotaFiscalBuilder comObservacao(String observacoes) {
        notaFiscal.setObservacoes(observacoes );
        return this;
    }

    public NotaFiscal constroi() {
        return notaFiscal;
    }
}
