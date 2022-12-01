package clases;

public class Carta {
    private int valor;
    private String especial;
    private boolean comodin;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getEspecial() {
        return especial;
    }

    public void setEspecial(String especial) {
        this.especial = especial;
    }

    public boolean isComodin() {
        return comodin;
    }

    public void setComodin(boolean comodin) {
        this.comodin = comodin;
    }

    public Carta(int valor, String especial, boolean comodin) {
        this.valor = valor;
        this.especial = especial;
        this.comodin = comodin;
    }

    public String toString() {
        return " Valor " + valor + ", Especial " + especial + ", Comodin " + comodin + "\n";
    }
}
