import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome,int codigoConvidado){
        convidadoSet.add(new Convidado(nome,codigoConvidado));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        for(Convidado c: convidadoSet){
            if (c.getCodigoConvite()== codigoConvite){
                convidadoSet.remove(c);
                break;
            }
        }
    }

    public int  ContarConvidados(){
        return convidadoSet.size();
    }

    public  void exibirconvidados(){
        System.out.println(convidadoSet);
    }
}
