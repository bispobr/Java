//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ConjuntoConvidados convidados= new ConjuntoConvidados();

        convidados.adicionarConvidado("Pedro",1);
        convidados.adicionarConvidado("lucas",2);
        convidados.adicionarConvidado("Pedro",1);

        convidados.exibirconvidados();
        System.out.println(convidados.ContarConvidados());
        convidados.removerConvidadoPorCodigoConvite(2);

        convidados.exibirconvidados();

    }
}