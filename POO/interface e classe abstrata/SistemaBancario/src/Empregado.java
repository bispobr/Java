public class Empregado {

    protected String nome;
    protected String SobreNome;
    protected int NumIdent;

    public Empregado(String nome, String sobreNome, int numIdent) {
        this.nome = nome;
        SobreNome = sobreNome;
        NumIdent = numIdent;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return SobreNome;
    }

    public void setSobreNome(String sobreNome) {
        SobreNome = sobreNome;
    }

    public int getNumIdent() {
        return NumIdent;
    }

    public void setNumIdent(int numIdent) {
        NumIdent = numIdent;
    }

    @Override
    public String toString() {
        return "Empregado{" +
                "nome='" + nome + '\'' +
                ", SobreNome='" + SobreNome + '\'' +
                ", NumIdent=" + NumIdent +
                '}';
    }
}
