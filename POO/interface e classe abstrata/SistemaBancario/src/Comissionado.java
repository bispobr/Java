public class Comissionado extends Empregado {

    private double totvendas;
    private int porcentagem;

    public Comissionado(String nome, String sobreNome, int numIdent, double vendas) {
        super(nome, sobreNome, numIdent);
        this.totvendas = vendas;
        this.porcentagem = 6;
    }

    public double getTotvendas() {
        return totvendas;
    }

    public int getPorcentagem() {
        return porcentagem;
    }

    public void setPorcentagem(int porcentagem) {
        this.porcentagem = porcentagem;
    }

    public double getValorAPagar() {
        return (getTotvendas() * getPorcentagem()) / 100;
    }

    @Override
    public String toString() {
        return "Comissionado{" +
                "totvendas=" + totvendas +
                ", porcentagem=" + porcentagem +
                ", nome='" + nome + '\'' +
                ", SobreNome='" + SobreNome + '\'' +
                ", NumIdent=" + NumIdent +
                '}';
    }
}
