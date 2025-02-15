//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    AgendaContatos contato = new AgendaContatos();

    contato.adicionarcontato("ana",123456780);
    contato.adicionarcontato("clara",123456781);
    contato.adicionarcontato("bia",123456782);
    contato.adicionarcontato("lia",123456783);

    contato.exibirContato();

    System.out.println(contato.pesquisarPorNome("lia"));

    contato.removerContato("bia");

    contato.exibirContato();
    }
}