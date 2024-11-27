public class Assalariado extends Empregado {

    private double salario;
    private double horasTrabalhadas;
    private double jornadaDeTrabalho;
    private double valorHoraExtra;

    public Assalariado(String nome, String sobreNome, int numIdent, double horas, double valorHoraExtra) {
        super(nome, sobreNome, numIdent);
        this.salario = 1320;
        this.horasTrabalhadas = horas;
        this.jornadaDeTrabalho = 40;
        this.valorHoraExtra = valorHoraExtra;
    }

    public double getSalario() {
        return salario;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public double getJornadaDeTrabalho() {
        return jornadaDeTrabalho;
    }

    public double getValorHoraExtra() {
        return valorHoraExtra;
    }

    public double getValorAPagar() {
        if (getHorasTrabalhadas() <= getJornadaDeTrabalho()) {
            return getSalario();
        } else {
            return getSalario() + ((getHorasTrabalhadas() - getJornadaDeTrabalho()) * getValorHoraExtra());
        }

    }

    @Override
    public String toString() {
        return "Assalariado{" +
                "NumIdent=" + NumIdent +
                ", SobreNome='" + SobreNome + '\'' +
                ", nome='" + nome + '\'' +
                ", jornadaDeTrabalho=" + jornadaDeTrabalho +
                ", horasTrabalhadas=" + horasTrabalhadas +
                ", salario=" + salario +
                '}';
    }
}
