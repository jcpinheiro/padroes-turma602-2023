package edu.ifma.turma602.roteiro03;


import java.time.LocalDate;

public class BalancoEmpresaTeste {

    public static void main(String[] args) {
       BalancoEmpresa balancoEmpresa = new BalancoEmpresa();

        balancoEmpresa.registraDivida("Banco XYZ", "82.761.345/0001-22", 1000.00);
        System.out.println(balancoEmpresa );

        Pagamento pagamento = new Pagamento();
        pagamento.setValor(200);
        pagamento.setData(LocalDate.now());

        balancoEmpresa.pagaDivida("82.761.345/0001-22", pagamento );
        System.out.println(balancoEmpresa );


    }
}
