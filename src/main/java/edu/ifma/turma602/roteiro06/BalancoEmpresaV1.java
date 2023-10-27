package edu.ifma.turma602.roteiro06;

public class BalancoEmpresaV1 {

    private BancoDeDados bd = new BancoDeDados("servidor", "joao", "secreta");

    public void registraDivida(Divida divida ) {
         bd.salva(divida );
    }

    public void pagaDivida(Documento documentoCredor, Pagamento pagamento ) {
        Divida divida = bd.carrega(documentoCredor );

        if (divida != null) {
            divida.registra(pagamento );

        } else {
            throw new IllegalArgumentException("O Documento é Invalido!!" );
        }
    }

    public void desconecta() {
        System.out.println("Desconectado do banco de dados com sucesso!" );
    }

    @Override
    public String toString() {
        return "BalancoEmpresa{" +
                "bd=" + bd +
                '}';
    }
}
