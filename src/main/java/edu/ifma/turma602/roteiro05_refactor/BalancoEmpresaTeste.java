package edu.ifma.turma602.roteiro05_refactor;


import java.time.LocalDate;

public class BalancoEmpresaTeste {

    public static void main(String[] args) {
       BalancoEmpresa balancoEmpresa = new BalancoEmpresa();


        Divida divida = new Divida(1000);
        divida.setCredor("Banco XYZ");
        divida.setDocumentoCredor(new CNPJ("82.761.345/0001-22" ) );

        balancoEmpresa.registraDivida(divida );
        System.out.println(balancoEmpresa );

        Pagamento pagamento = new Pagamento();
        pagamento.setValor(200);
        pagamento.setData(LocalDate.now());

        balancoEmpresa.pagaDivida(new  CNPJ("82.761.345/0001-22" ) , pagamento );
        System.out.println(balancoEmpresa );


    }
}
