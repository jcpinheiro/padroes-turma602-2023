package edu.ifma.turma602.roteiro05_refactor;

import java.text.NumberFormat;
import java.util.Locale;

public class RelatorioDeDividas {

    //private Divida divida;

/*
    public RelatorioDeDividas(Divida divida ) {
        this.divida = divida;
    }
*/

    public void geraRelatorio(Divida divida, NumberFormat formatador ) {
        System.out.println("Credor: " + divida.getCredor() );
        System.out.println("CNPJ do Credor: " + divida.getDocumentoCredor() );

        //NumberFormat formatador = NumberFormat.getCurrencyInstance( new Locale("pt", "BR"));
        //NumberFormat formatador = NumberFormat.getCurrencyInstance( Locale.UK);
        //NumberFormat formatador = NumberFormat.getCurrencyInstance( );

        System.out.println("Total da Divida: " +  formatador.format(divida.getTotal() ) );
    }


    public static void main(String[] args) {
        Divida divida = new Divida(5000);
        divida.setCredor("Banco ABC");
        divida.setDocumentoCredor(new CNPJ("57.388.880/0001-32") );

        NumberFormat formatador = NumberFormat.getCurrencyInstance( new Locale("pt", "BR"));

        RelatorioDeDividas relatorio = new RelatorioDeDividas( );
        relatorio.geraRelatorio(divida, formatador );

    }


}
