package edu.ifma.turma602.roteiro04;

import java.util.HashMap;

public class BalancoEmpresa {

    private HashMap<CNPJ, Divida> dividas = new HashMap<>();

//    public void registraDivida(String credor, String cnpjCredor, double total, String telefone ) {
    public void registraDivida(Divida divida ) {
        /* Divida divida = new Divida(total);
        divida.setCredor(credor );
        divida.setCnpjCredor(cnpjCredor );*/
        dividas.put(divida.getCnpjCredor(), divida );

    }

    //public void pagaDivida(String cnpjCredor, double valor, String pagador, LocalDate dataPagamento ) {

    public void pagaDivida(String cnpjCredor, Pagamento pagamento ) {
        Divida divida = dividas.get(cnpjCredor);

        if (divida != null) {
            divida.registra(pagamento );

        } else {
            throw new IllegalArgumentException("O CNPJ é Invalido!!" );
        }
    }

    @Override
    public String toString() {
        return "BalancoEmpresa{" +
                "dividas=" + dividas +
                '}';
    }
}
