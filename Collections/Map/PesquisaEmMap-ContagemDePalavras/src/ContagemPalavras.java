import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

    private Map<String,Integer> palavrasMap;

    public ContagemPalavras() {
        this.palavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        palavrasMap.put(palavra,contagem);
    }

    public  void removerPalavra(String palavra){

        if (!palavrasMap.isEmpty()){
            palavrasMap.remove(palavra);
        }
    }

    public void exibirContagemPalavras(){
        System.out.println(palavrasMap);
    }

    public String encontrarPalavrasMaisFrequente() {
        String linguagemMaisFrequente = null;
        int maiorContagem = 0;
        for (Map.Entry<String, Integer> entry : palavrasMap.entrySet()) {
            if (entry.getValue() > maiorContagem) {
                maiorContagem = entry.getValue();
                linguagemMaisFrequente = entry.getKey();
            }
        }
        return linguagemMaisFrequente;
    }

}
