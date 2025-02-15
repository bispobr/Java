//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    ListaTarefa listaTarefa = new ListaTarefa();

    listaTarefa.adidionarTarefa("tarefa1");
    listaTarefa.adidionarTarefa("tarefa2");
    listaTarefa.adidionarTarefa("tarefa3");
    listaTarefa.adidionarTarefa("tarefa4");

        System.out.println("Quantidade de items na lista:" + listaTarefa.numeroTarefas());

        listaTarefa.descricoestarefas();

        listaTarefa.removerTarefa("tarefa4");

        System.out.println("Quantidade de items na lista:" + listaTarefa.numeroTarefas());
    }
}