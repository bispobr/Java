public class Telefone {

    private int codigo;
    private String numSerie;
    private String modelo;
    private double peso;

    public Telefone(int codigo, String numSerie, String modelo, double peso2) {
        this.codigo = codigo;
        this.numSerie = numSerie;
        this.modelo = modelo;
        this.peso = peso2;
    }

    
    public void imprimirDados() {
        System.out.println("Telefone [codigo=" + this.codigo + ", numSerie=" + this.numSerie + ", modelo=" + this.modelo + ", peso=" + this.peso + "]");
        
    }

}
