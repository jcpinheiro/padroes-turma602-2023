package edu.ifma.turma602.roteiro06;

import java.time.LocalDate;

public class PagamentoTeste {


    public static void main(String[] args) {

        Pagamento pagamento1 = new Pagamento();

        pagamento1.setData(LocalDate.now() );
        pagamento1.setPagador("Empresa XYZ");
        pagamento1.setValor(200 );



        Pagamento pagamento2 = new Pagamento();
        pagamento2.setData(LocalDate.now() );
        pagamento2.setPagador("Empresa XYZ");
        pagamento2.setValor(200 );


        System.out.println(pagamento1 );
        System.out.println(pagamento2 );

        System.out.println(pagamento1.equals(pagamento2) );

    }

}
