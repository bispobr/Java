import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public  void adicionarProduto(int cod, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(nome,cod,preco,quantidade));
    }

    public  Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosOrdenadosNome = new TreeSet<>(produtoSet);
        return produtosOrdenadosNome;


    }

    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosOrdenadosPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosOrdenadosPreco.addAll(produtoSet);
        return produtosOrdenadosPreco;
    }
}
