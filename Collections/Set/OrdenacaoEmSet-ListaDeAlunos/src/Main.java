//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     GerenciadorAlunos Alunos = new GerenciadorAlunos();

     Alunos.adicionarAluno("lara",12345,8.5);
     Alunos.adicionarAluno("ana",12346,6.5);
     Alunos.adicionarAluno("brendo",12347,7.5);
     Alunos.adicionarAluno("bia",12348,9.5);
     Alunos.adicionarAluno("Intruso",12347,7.5);

     Alunos.exibirAlunos();

     System.out.println(Alunos.exibirAlunosPorNome());
     System.out.println(Alunos.exibirAlunosPorNota());

     Alunos.removerAluno(12348);

     Alunos.exibirAlunos();
    }
}