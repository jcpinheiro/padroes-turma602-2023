package edu.ifma.turma602.padroes.p05decorator;

import java.util.ArrayList;
import java.util.List;

class TesteNotaFiscal {

  public static void main(String[] args) {

    List<Item> itens = new ArrayList<>();

    itens.add(new Item(200, 3));
    itens.add(new Item(300, 2));
    itens.add(new Item(400, 1));

    /*
    double valorTotal = 0;

    for(Item item : itens) {
      valorTotal += item.getSubTotal();
    }
    double impostos = valorTotal * 0.05;

    NotaFiscal nf = new NotaFiscal("razao social qualquer",
                                   "um cnpj",
                                    LocalDate.now(),
                                    valorTotal,
                                    impostos,
                                    itens,
                                    "observacoes quaisquer aqui");
    System.out.println(nf );

*/

    NotaFiscal notaFiscal =  new NotaFiscalBuilder()
                              .paraEmpresa("Empresa xyz")
                              .comCNPJ("94.166.412/0001-40")
                              .naDataAtual()
                              .adiciona(itens)
                              .comObservacao("Uma observação qualquer")
                              .constroi();

    System.out.println(notaFiscal );
  }
}
