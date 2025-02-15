//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    CatalogoLivros livros=new CatalogoLivros();

    livros.adicionarlivro("A cabana","erick",1995);
    livros.adicionarlivro("Manual","marcaos",2000);

    System.out.println(livros.pesquisarPorAutor("erick"));
    System.out.println(livros.pesquisarPorTitulo("Manual"));
    System.out.println(livros.pesquisaPorIntervaloAnos(1997,2010));
    }
}