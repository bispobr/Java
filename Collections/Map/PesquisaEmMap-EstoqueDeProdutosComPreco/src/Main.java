//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    EstoqueProdutos produtos = new EstoqueProdutos();

    produtos.adicionarProduto(1,"sal",10,5.0);
    produtos.adicionarProduto(2,"cafe",15,100.0);
    produtos.adicionarProduto(3,"suco",2,15.0);


    produtos.exibirProduto();

    System.out.println(produtos.obterProdutoMaisBarato());
    System.out.println(produtos.obterProdutoMaisCaro());
    System.out.println(produtos.calcularValorTotalEstoque());



    }
}