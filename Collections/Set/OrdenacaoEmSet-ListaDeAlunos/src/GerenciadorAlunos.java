import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    private Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, int matricula, double media){
       alunoSet.add(new Aluno(nome,matricula,media));
    }

    public  void removerAluno(int matricula){

        for (Aluno a: alunoSet){
            if (a.getMatricula() == matricula){
                alunoSet.remove(a);
                break;

            }
        }
    }

    public  Set<Aluno> exibirAlunosPorNome(){
        Set<Aluno> ordenadosPorNome = new TreeSet<>(alunoSet);
        return ordenadosPorNome;
    }

    public  Set<Aluno> exibirAlunosPorNota(){
        Set<Aluno> ordenadosPorNota = new TreeSet<>( new ComparetorPorNota());
        ordenadosPorNota.addAll(alunoSet);
        return ordenadosPorNota;
    }

    public  void exibirAlunos(){
        System.out.println(alunoSet);
    }
}
