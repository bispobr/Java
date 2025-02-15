import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long,Produto> estoqueMap;

    public EstoqueProdutos() {
        this.estoqueMap = new HashMap<>();
    }


    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueMap.put(cod,new Produto(nome, preco, quantidade));
    }

    public void exibirProduto(){
        System.out.println(estoqueMap);
    }

    public double calcularValorTotalEstoque(){
        double valortotal = 0;
        if(!estoqueMap.isEmpty()){
            for (Produto p : estoqueMap.values()){
                valortotal +=  p.getQuantidade() * p.getPreco();
            }
        }
        return valortotal;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maisCaro= Double.MIN_VALUE;

        if(!estoqueMap.isEmpty()){
            for (Produto p : estoqueMap.values()){
                if (p.getPreco() > maisCaro){
                    produtoMaisCaro = p;
                    maisCaro= p.getPreco();
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisbarato = null;
        double maisBarato= Double.MAX_VALUE;

        if(!estoqueMap.isEmpty()){
            for (Produto p : estoqueMap.values()){
                if (p.getPreco()< maisBarato){
                    produtoMaisbarato = p;
                    maisBarato = p.getPreco();
                }
            }
        }
        return produtoMaisbarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto produtoMaiorQuantidadeValorNoEstoque = null;
        double maiorValorTotalProdutoEstoque = 0d;
        if (!estoqueMap.isEmpty()) {
            for (Map.Entry<Long, Produto> entry : estoqueMap.entrySet()) {
                double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
                if (valorProdutoEmEstoque > maiorValorTotalProdutoEstoque) {
                    maiorValorTotalProdutoEstoque = valorProdutoEmEstoque;
                    produtoMaiorQuantidadeValorNoEstoque = entry.getValue();
                }
            }
        }
        return produtoMaiorQuantidadeValorNoEstoque;
    }

}
