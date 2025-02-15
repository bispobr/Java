//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    ConjuntoPalavrasUnicas palavras = new ConjuntoPalavrasUnicas();

    palavras.adicionarPalavra("palavra1");
    palavras.adicionarPalavra("palavra2");
    palavras.adicionarPalavra("palavra3");
    palavras.adicionarPalavra("palavra1");
    palavras.adicionarPalavra("palavra2");
    palavras.adicionarPalavra("palavra4");

    palavras.exibirPalavrasUnicas();
    palavras.verificarPalavra("palavra1");
    palavras.verificarPalavra("palavra9");
    }
}