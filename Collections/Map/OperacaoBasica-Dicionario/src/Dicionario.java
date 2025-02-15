import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private Map<String,String> definicaoMap;

    public Dicionario() {
        this.definicaoMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        definicaoMap.put(palavra, definicao);
    }

    public  void removerPalavra(String palavra){
        if (!definicaoMap.isEmpty()){
            definicaoMap.remove(palavra);
        }
    }

    public void exibirPalavras(){
        System.out.println(definicaoMap);
    }

    public String pesquisarPorPalavra(String palavra) {
        String definicao=null;
        if (!definicaoMap.isEmpty()){
            definicao = definicaoMap.get(palavra);
        }
        return definicao;
    }

}
