package edu.ifma.turma602.roteiro05_refactor;

public class CNPJ implements Documento {

    private String valor;


    public CNPJ(String valor) {
        this.valor = valor;
    }

    @Override
    public String getValor() {
        return valor;
    }

    @Override
    public boolean ehValido() {
        return primeiroDigitoVerificador() == primeiroDigitoCorreto()
                && segundoDigitoVerificador() == segundoDigitoCorreto();
    }

    private boolean segundoDigitoCorreto() {
        return true;
    }

    private boolean segundoDigitoVerificador() {
        return true;
    }

    private boolean primeiroDigitoCorreto() {
        return true;
    }

    private boolean primeiroDigitoVerificador() {
        return true;
    }


    @Override
    public String toString() {
        return "CNPJ{" +
                "valor='" + valor + '\'' +
                '}';
    }
}
