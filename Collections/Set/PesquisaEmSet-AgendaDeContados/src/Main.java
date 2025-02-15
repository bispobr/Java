//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        AgendaContatos Contatos =  new AgendaContatos();

        Contatos.adicionarContato("ana",99999999);
        Contatos.adicionarContato("lucia",888888888);
        Contatos.adicionarContato("pedro",99999988);
        Contatos.adicionarContato("pedro Lucas",99999988);

        Contatos.exibirContatos();

        System.out.println(Contatos.pesquisarPorNome("pedro"));

        Contatos.atualizarNumeroContato("pedro",333333333);
    }
}