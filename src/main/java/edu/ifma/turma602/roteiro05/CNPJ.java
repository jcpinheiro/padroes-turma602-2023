package edu.ifma.turma602.roteiro05;

public class CNPJ {

    private String valor;


    public CNPJ(String valor) {
        this.valor = valor;
    }

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
