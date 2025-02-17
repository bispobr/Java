public class Conta implements Pagavel {
    protected int dia;
    protected int mes;
    protected double valor;

    public Conta(int dia, int mes, double valor) {
        this.dia = dia;
        this.mes = mes;
        this.valor = valor;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public double getValorAPagar() {
        return this.valor;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "dia=" + dia +
                ", mes=" + mes +
                ", valor=" + valor +
                '}';
    }
}
