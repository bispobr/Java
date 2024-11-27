public class Concessionario extends Conta{
    public Concessionario(int dia, int mes, double valor) {
        super(dia, mes, valor);
    }

    @Override
    public double getValorAPagar() {
        return super.getValorAPagar();
    }

    @Override
    public String toString() {
        return "Concessionario{" +
                "dia=" + dia +
                ", mes=" + mes +
                ", valor=" + valor +
                '}';
    }
}
