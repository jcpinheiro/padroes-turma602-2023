package edu.ifma.turma602.roteiro01;

import java.util.HashMap;
import java.util.Objects;

public class BalancoEmpresa {

    private HashMap<String, Divida> dividas = new HashMap<>();

    public void registraDivida(String credor, String cnpjCredor, double total ) {

        Divida divida = new Divida(total);
        divida.setCredor(credor );
        divida.setCnpjCredor(cnpjCredor );

        dividas.put(cnpjCredor, divida );

    }

    public void pagaDivida(String cnpjCredor, double valor) {

        Divida divida = dividas.get(cnpjCredor);

        if (divida != null) {
           // divida.setValorPago(divida.getValorPago() +  valor );


           divida.efetuaPagamento(valor );

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
