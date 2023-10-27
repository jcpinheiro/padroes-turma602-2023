package edu.ifma.turma602.roteiro06;

public class MinhaAplicacao {

    public static void main(String[] args) {
        BancoDeDados bd = new BancoDeDados("servidor", "usr", "senha");
        ArquivoDeDividas arquivo = new ArquivoDeDividas("dividas.txt");

        BalancoEmpresa balanco = new BalancoEmpresa(bd );
        registraDividas(balanco );
        // ...
        realizaPagamentos(balanco );

        bd.desconecta();
    }

    private static void registraDividas(BalancoEmpresa balanco) {
        Divida d1 = new Divida(5000);
        d1.setDocumentoCredor(new CNPJ("00.000.000/0001-01") );

        Divida d2 = new Divida(10000);
        d2.setDocumentoCredor(new CNPJ("00.000.000/0001-01") );

        // preenche dados das dividas
        balanco.registraDivida(d1);
        balanco.registraDivida(d2);
    }

    private static void realizaPagamentos(BalancoEmpresa balanco) {
        Pagamento p1 = new Pagamento();
        p1.setValor(500);

        Pagamento p2 = new Pagamento();
        p2.setValor(1000);

        Documento credor = new CNPJ("00.000.000/0001-01");
        // preenche dados dos pagamentos

        balanco.pagaDivida(credor, p1);
        balanco.pagaDivida(credor, p2);
    }
}
