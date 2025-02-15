//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    OrdenacaoPessoas ordenarPessoa= new OrdenacaoPessoas();
    ordenarPessoa.adicinarPessoa("pessoa1",30,1.56);
    ordenarPessoa.adicinarPessoa("Pessoa2",29,1.80);
    ordenarPessoa.adicinarPessoa("pessoa3",25,1.70);
    ordenarPessoa.adicinarPessoa("Pessoa2",17,1.80);

    System.out.println(ordenarPessoa.ordenarPorIdade());
    System.out.println(ordenarPessoa.ordenaPorAltura());

    }
}