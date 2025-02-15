public class Numero implements Comparable<Numero> {

    private int numero;

    public Numero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Numero{" +
                "numero=" + numero +
                '}';
    }

    @Override
    public int compareTo(Numero o) {
        return Integer.compare(numero,o.getNumero());
    }
}
