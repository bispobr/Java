import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

   private List<Item> carrinho;

    public CarrinhoDeCompras() {
        this.carrinho = new ArrayList<>();
    }

    public  void adicionarItem(String nome,double preco,int quantidade){
        carrinho.add(new Item(nome, preco, quantidade));
    }

    public  void removerItem(String nome){
        List<Item> itensARemover = new ArrayList<>();
        if (!carrinho.isEmpty()){
            for (Item c: carrinho){
                if(c.getNome().equalsIgnoreCase(nome)){
                    itensARemover.add(c);
                }
            }
            carrinho.removeAll(itensARemover);
        } else{
            System.out.println("O Carrinho de compras esta vazio");
        }


    }

    public double calcularValorTotal(){
        double total = 0;
        if (!carrinho.isEmpty()) {
            for (Item i : carrinho) {
                total += i.getPreco() * i.getQuantidade();
            }
            return total;
        } else{
            throw  new RuntimeException("O Carrinho de compras esta vazio");
        }
    }

    public void exibirItens (){
       if (!carrinho.isEmpty()){
           for (Item i : carrinho){
               System.out.println(i);
           }
       } else{
           System.out.println("O Carrinho de compras esta vazio");
       }

    }
}
