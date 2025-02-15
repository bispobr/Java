import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adidionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
       List<Tarefa> removerTarefas = new ArrayList<>();
       for (Tarefa t: tarefaList){
           if (t.getDescricao().equalsIgnoreCase(descricao)){
               removerTarefas.add(t);
           }
       }
       tarefaList.removeAll(removerTarefas);
    }

    public int numeroTarefas(){
        return tarefaList.size();
    }

    public void descricoestarefas (){
        System.out.println(tarefaList);
    }
}
