//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    CadastroProdutos Produtos = new CadastroProdutos();

    Produtos.adicionarProduto(123450,"margarian",15.50,3);
    Produtos.adicionarProduto(123451,"Sabão",19.00,10);
    Produtos.adicionarProduto(123452,"caneta",9.00,15);
    Produtos.adicionarProduto(123453,"caneta",9.00,5);

        System.out.println(Produtos.exibirProdutosPorNome());
        System.out.println(Produtos.exibirProdutosPorPreco());

    }
}