//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ContagemPalavras contagem = new ContagemPalavras();

        contagem.adicionarPalavra("Java", 2);
        contagem.adicionarPalavra("Python", 8);
        contagem.adicionarPalavra("JavaScript", 1);
        contagem.adicionarPalavra("C#", 6);

        contagem.exibirContagemPalavras();

        contagem.removerPalavra("C#");

        contagem.exibirContagemPalavras();

        System.out.println(contagem.encontrarPalavrasMaisFrequente());

    }
}