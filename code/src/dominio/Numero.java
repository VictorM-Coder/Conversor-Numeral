package dominio;

public class Numero {
    private int tamanho;
    private String valor;
    private int base;

    public Numero(String valor, int base) {
        this.valor = valor;
        this.base = base;
        this.tamanho = this.valor.length();
    }

    public int getTamanho() {
        return tamanho;
    }

    public String getValor() {
        return valor;
    }

    public int getBase() {
        return base;
    }
}
