public class AssalariadoComissionado extends Comissionado {

    private double salario;

    public AssalariadoComissionado(String nome, String sobreNome, int numIdent, double vendas, int porcentagem) {
        super(nome, sobreNome, numIdent, vendas);
        this.setPorcentagem(porcentagem);
        this.salario = 1320;
    }


    public double getSalario() {
        return salario;
    }

    @Override
    public double getValorAPagar() {
        return getSalario() + (this.getTotvendas() * this.getPorcentagem()) / 100;
    }

    @Override
    public String toString() {
        return "AssalariadoComissionado{" +
                "salario=" + salario +
                ", nome='" + nome + '\'' +
                ", SobreNome='" + SobreNome + '\'' +
                ", NumIdent=" + NumIdent +
                '}';
    }
}
