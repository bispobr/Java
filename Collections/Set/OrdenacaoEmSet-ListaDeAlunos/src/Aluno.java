import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno> {

    private String nome;

    private int matricula;

    private double nota;

    public Aluno(String nome, int matricula, double nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public double getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", nota=" + nota +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return matricula == aluno.matricula;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(matricula);
    }

    @Override
    public int compareTo(Aluno o) {
        return nome.compareToIgnoreCase(o.getNome());
    }
}

class  ComparetorPorNota implements Comparator<Aluno>{


    @Override
    public int compare(Aluno o1, Aluno o2) {
        return Double.compare(o1.getNota(),o2.getNota());
    }
}
