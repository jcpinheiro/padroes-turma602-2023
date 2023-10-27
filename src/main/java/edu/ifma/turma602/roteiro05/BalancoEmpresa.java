package edu.ifma.turma602.roteiro05;

import java.util.HashMap;

public class BalancoEmpresa {

    private HashMap<CNPJ, Divida> dividasPJ = new HashMap<>();
    private HashMap<CPF, Divida> dividasPF = new HashMap<>();

    public void registraDivida(Divida divida ) {

       if (divida.getCnpjCredor() != null)
         dividasPJ.put(divida.getCnpjCredor(), divida );

       else if (divida.getCpfCredor() != null )
           dividasPF.put(divida.getCpfCredor(), divida);

       else
           throw new IllegalArgumentException("A divida deve está associada a um CPF ou CNPJ");

    }

    public void pagaDivida(CNPJ cnpjCredor, Pagamento pagamento ) {
        Divida divida = dividasPJ.get(cnpjCredor);

        if (divida != null) {
            divida.registra(pagamento );

        } else {
            throw new IllegalArgumentException("O CNPJ é Invalido!!" );
        }
    }

    public void pagaDivida(CPF cpfCredor, Pagamento pagamento ) {
        Divida divida = dividasPF.get(cpfCredor);

        if (divida != null) {
            divida.registra(pagamento );

        } else {
            throw new IllegalArgumentException("O CPF é Invalido!!" );
        }
    }

    @Override
    public String toString() {
        return "BalancoEmpresa{" +
                "dividas=" + dividasPJ +
                '}';
    }
}
