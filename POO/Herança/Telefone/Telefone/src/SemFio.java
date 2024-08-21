public class SemFio extends Telefone {

    private float frequencia;
    private int canais;
    private float distancia;

    public SemFio(int codigo, String numSerie, String modelo, double peso, float frequencia, float distancia,int canais) {
        super(codigo, numSerie, modelo, peso);
        
        this.frequencia = frequencia;
        this.distancia = distancia;
        this.canais = canais;
    }

    @Override
    public void imprimirDados() {
        System.out.println("SemFio [canais=" + this.canais + ", frequencia="+ this.frequencia +", distancia="+this.distancia+" ]"); 
    }

    
    
}
