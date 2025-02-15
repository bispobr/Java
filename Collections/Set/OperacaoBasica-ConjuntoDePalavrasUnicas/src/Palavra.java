import java.util.Objects;

public class Palavra {
    private String Palavra;

    public Palavra(String palavra) {
        Palavra = palavra;
    }

    public String getPalavra() {
        return Palavra;
    }

    @Override
    public String toString() {
        return "Palavra{" +
                "Palavra='" + Palavra + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Palavra palavra = (Palavra) o;
        return Objects.equals(Palavra, palavra.Palavra);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(Palavra);
    }
}
