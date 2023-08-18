package edu.ifma.turma602.roteiro01;

public class DividaTeste {

    public static void main(String[] args) {
        Divida dividaDoJoao = new Divida(1000 );

        dividaDoJoao.setCredor("João da Silva");

        dividaDoJoao.setCnpjCredor("15.416.085/0001-60");
        dividaDoJoao.efetuaPagamento(300 );
        dividaDoJoao.efetuaPagamento(200 );

        //dividaDoJoao.setTotal(2000 );

        System.out.println("Credor: " + dividaDoJoao.getCredor() );
        System.out.println("Cnpj Credor: " + dividaDoJoao.getCnpjCredor() );
        System.out.println("Total da Divida: " + dividaDoJoao.getTotal() );
        System.out.println("Valor já Pago: " + dividaDoJoao.getValorPago() );

    }

}
