import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String,Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarcontato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public  void removerContato(String nome){
        if (!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContato(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroTelefone = null;
        if (!agendaContatoMap.isEmpty()){
            numeroTelefone = agendaContatoMap.get(nome);
        }
        return numeroTelefone;
    }
}
