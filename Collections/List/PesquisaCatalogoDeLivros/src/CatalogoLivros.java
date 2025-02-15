import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> LivroList;

    public CatalogoLivros() {
        this.LivroList = new ArrayList<>();
    }

    public void adicionarlivro(String titulo, String autor, int ano){
        LivroList.add(new Livro(titulo,autor,ano));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livroautor=new ArrayList<>();

       if(!LivroList.isEmpty()){

           for(Livro l: LivroList){
               if(l.getAutor().equalsIgnoreCase(autor)){
                  livroautor.add(l);
               }
           }
       } else {
           System.out.println("A lista de Livros está vazia.");
       }
        return livroautor;
    }

    public List<Livro> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> pesquisaInervalo=new ArrayList<>();
        if(!LivroList.isEmpty()){
            for(Livro l: LivroList){
                if(l.getAno() >= anoInicial && l.getAno()<=anoFinal){
                    pesquisaInervalo.add(l);
                }
            }
        } else {
            System.out.println("A lista de Livros está vazia.");
        }
        return pesquisaInervalo;
    }

    public  Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo=null;
        if(!LivroList.isEmpty()){
            for(Livro l: LivroList){
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }
}
