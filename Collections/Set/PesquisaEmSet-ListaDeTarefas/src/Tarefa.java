import java.util.Objects;

public class Tarefa {

    private String deescricao;
    private boolean concluido;

    public Tarefa(String deescricao) {
        this.deescricao = deescricao;
        this.concluido = false;
    }

    public String getDeescricao() {
        return deescricao;
    }

    public boolean isConcluido() {
        return concluido;
    }

    public void setConcluido(boolean concluido) {
        this.concluido = concluido;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "deescricao='" + deescricao + '\'' +
                ", concluido=" + concluido +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tarefa tarefa = (Tarefa) o;
        return Objects.equals(deescricao, tarefa.deescricao);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(deescricao);
    }
}
