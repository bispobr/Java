public class Terceirizado extends Empregado {

    private double horasTrabalhadas;
    private double valorHora;

    public Terceirizado(String nome, String sobreNome, int numIdent, double horatrabalho) {
        super(nome, sobreNome, numIdent);
        this.horasTrabalhadas = horatrabalho;
        this.valorHora = 8.00;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public double getValorAPagar() {
        return getValorHora() * getHorasTrabalhadas();
    }

    @Override
    public String toString() {
        return "Terceirizado{" +
                "horasTrabalhadas=" + horasTrabalhadas +
                ", valorHora=" + valorHora +
                ", nome='" + nome + '\'' +
                ", SobreNome='" + SobreNome + '\'' +
                ", NumIdent=" + NumIdent +
                '}';
    }
}
