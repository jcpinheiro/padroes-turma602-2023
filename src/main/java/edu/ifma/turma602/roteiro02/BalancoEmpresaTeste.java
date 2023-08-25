package edu.ifma.turma602.roteiro02;

import java.time.LocalDate;

public class BalancoEmpresaTeste {

    public static void main(String[] args) {
        BalancoEmpresa balancoEmpresa = new BalancoEmpresa();

        balancoEmpresa.registraDivida("Banco XYZ", "82.761.345/0001-22", 1000.00);
        System.out.println(balancoEmpresa );

        balancoEmpresa.pagaDivida("82.761.345/0001-22", 200, "Empresa xyz", LocalDate.now() );
        System.out.println(balancoEmpresa );


    }
}
