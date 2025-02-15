//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras compras = new CarrinhoDeCompras();

        compras.exibirItens();
        compras.removerItem("frauda");


        compras.adicionarItem("frauda",5.50,3);
        compras.adicionarItem("leite",3.50,3);
        compras.exibirItens();

        System.out.println("Total da compar:" + compras.calcularValorTotal());

        compras.removerItem("leite");

        compras.exibirItens();
    }
}