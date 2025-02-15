//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ListaTarefas tarefas = new ListaTarefas();

        tarefas.adicionarTarefa("Tarefa1");
        tarefas.adicionarTarefa("Tarefa2");
        tarefas.adicionarTarefa("Tarefa3");
        tarefas.adicionarTarefa("Tarefa4");

        tarefas.exibirTarefas();
        tarefas.contarTarefas();

        System.out.println("Tarefas Pendente");
        System.out.println(tarefas.obterTarefasPendentes());

        tarefas.marcarTarefaConcluida("Tarefa1");
        tarefas.marcarTarefaConcluida("Tarefa2");

        System.out.println("Tarefas Concluidas");
        System.out.println(tarefas.obterTarefasConcluidas());

        tarefas.limparListaTarefas();

        tarefas.contarTarefas();
    }
}