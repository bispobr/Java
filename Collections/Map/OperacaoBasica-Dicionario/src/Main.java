//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Dicionario palavras = new Dicionario();

        palavras.adicionarPalavra("Nome","identifica algo ou um objeto");
        palavras.adicionarPalavra("Exibe","Mostra um objeto especifico");

        palavras.exibirPalavras();

        System.out.println(palavras.pesquisarPorPalavra("Nome"));
        palavras.removerPalavra("Nome");

        palavras.exibirPalavras();
    }
}