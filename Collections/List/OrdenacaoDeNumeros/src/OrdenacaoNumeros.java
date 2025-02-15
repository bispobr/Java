import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

    private List<Numero> numeroList;

    public OrdenacaoNumeros() {
        this.numeroList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numeroList.add(new Numero(numero));
    }

    public List<Numero> ordenarAscendente(){
        List<Numero> ordemAscendenteList= new ArrayList<>(numeroList);
        Collections.sort(ordemAscendenteList);
        return  ordemAscendenteList;
    }

    public List<Numero> ordenarDescendente() {
        List<Numero> ordenarDescendenteList = new ArrayList<>(numeroList);
        ordenarDescendenteList.sort(Collections.reverseOrder());
        return ordenarDescendenteList;
    }
}
