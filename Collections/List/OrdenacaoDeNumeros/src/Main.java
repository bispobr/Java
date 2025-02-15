//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      OrdenacaoNumeros ordem =  new OrdenacaoNumeros();

      ordem.adicionarNumero(5);
      ordem.adicionarNumero(3);
      ordem.adicionarNumero(1);

        System.out.println(ordem.ordenarAscendente());
        System.out.println(ordem.ordenarDescendente());
    }
}