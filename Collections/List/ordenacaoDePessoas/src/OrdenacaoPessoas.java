import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

    List<Pessoa> pessoaList;

    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicinarPessoa(String nome,int idade,double altura){
        pessoaList.add(new Pessoa(nome,idade,altura));
    }

    public List<Pessoa> ordenarPorIdade(){
      List<Pessoa> ordenadosPorIdade =new ArrayList<>(pessoaList);
        Collections.sort(ordenadosPorIdade);
        return ordenadosPorIdade;

    }

    public List<Pessoa> ordenaPorAltura(){
        List<Pessoa> ordenadosPorAltura =new ArrayList<>(pessoaList);
        Collections.sort(ordenadosPorAltura,new ComparatorPorAltura());
        return ordenadosPorAltura;
    }
}
