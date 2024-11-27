public class Quarto {

    private String tipo_quarto;

    private int numero_quarto;

    private boolean status_quarto;

    private boolean frigobar;

    private double preco_quarto;

    public Quarto(String tipo_quarto, int numero_quarto, boolean status_quarto, boolean frigobar, double preco_quarto) {
        this.tipo_quarto = tipo_quarto;
        this.numero_quarto = numero_quarto;
        this.status_quarto = status_quarto;
        this.frigobar = frigobar;
        this.preco_quarto = preco_quarto;
    }

    public String getTipo_quarto() {
        return tipo_quarto;
    }

    public void setTipo_quarto(String tipo_quarto) {
        this.tipo_quarto = tipo_quarto;
    }

    public int getNumero_quarto() {
        return numero_quarto;
    }

    public void setNumero_quarto(int numero_quarto) {
        this.numero_quarto = numero_quarto;
    }

    public boolean getStatus_quarto() {
        return status_quarto;
    }

    public void setStatus_quarto(boolean status_quarto) {
        this.status_quarto = status_quarto;
    }

    public boolean getFrigobar() {
        return frigobar;
    }

    public void setFrigobar(boolean frigobar) {
        this.frigobar = frigobar;
    }

    public double getPreco_quarto() {
        return preco_quarto;
    }

    public void setPreco_quarto(double preco_quarto) {
        this.preco_quarto = preco_quarto;
    }
}
