import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {

        for (Tarefa t :tarefaSet){
            if (t.getDeescricao().equalsIgnoreCase(descricao)){
                tarefaSet.remove(t);
                break;
            }
        }

    }

    public void exibirTarefas(){
        System.out.println(tarefaSet);
    }

    public void contarTarefas(){
        System.out.println("Quantidade de tarefas: " + tarefaSet.size());
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t: tarefaSet){
            if (t.isConcluido()){
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa t2: tarefaSet){
            if (!t2.isConcluido()){
                tarefasPendentes.add(t2);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){

        for(Tarefa t : tarefaSet){
            if (t.getDeescricao().equalsIgnoreCase(descricao)){
                t.setConcluido(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao){

        for(Tarefa t : tarefaSet){
            if (t.getDeescricao().equalsIgnoreCase(descricao)){
                t.setConcluido(false);
            }
        }
    }

    public void limparListaTarefas(){
        tarefaSet.clear();
    }

}
