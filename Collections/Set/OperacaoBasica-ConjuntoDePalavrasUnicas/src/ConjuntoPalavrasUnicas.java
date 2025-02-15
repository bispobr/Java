import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<Palavra>palavraSet;

    public ConjuntoPalavrasUnicas() {
        this.palavraSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
       palavraSet.add(new Palavra(palavra));
    }

    public void removerPalavra(String palavra){

        for(Palavra remover: palavraSet){
            if (Objects.equals(remover.getPalavra(), palavra)){
                palavraSet.remove(remover);
                break;
            }
        }
    }

    public void verificarPalavra(String palavra){
        String resultado = "a palavra "+ palavra + " não Presente no conjunto.";
        for (Palavra busca: palavraSet){
            if (Objects.equals(busca.getPalavra(),palavra)){
                resultado = "a palavra "+ palavra + " Esta Presente no conjunto.";
            }
        }
        System.out.println(resultado);
    }

    public void exibirPalavrasUnicas(){
        System.out.println(palavraSet);
    }
}
