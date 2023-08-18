package edu.ifma.turma602.roteiro01;

public class BalancoEmpresaTeste {

    public static void main(String[] args) {
        BalancoEmpresa balancoEmpresa = new BalancoEmpresa();

        balancoEmpresa.registraDivida("Banco XYZ", "82.761.345/0001-22", 1000.00);
        System.out.println(balancoEmpresa );

        balancoEmpresa.pagaDivida("82.761.345/0001-2", 200);
        System.out.println(balancoEmpresa );


    }
}
