package edu.ifma.turma602.roteiro05_refactor;

import java.util.HashMap;

public class BalancoEmpresa {

    private HashMap<Documento, Divida> dividas = new HashMap<>();

    public void registraDivida(Divida divida ) {
         dividas.put(divida.getDocumentoCredor(), divida );
    }

    public void pagaDivida(Documento documentoCredor, Pagamento pagamento ) {
        Divida divida = dividas.get(documentoCredor );

        if (divida != null) {
            divida.registra(pagamento );

        } else {
            throw new IllegalArgumentException("O Documento é Invalido!!" );
        }
    }



    @Override
    public String toString() {
        return "BalancoEmpresa{" +
                "dividas=" + dividas +
                '}';
    }
}
