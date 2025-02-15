import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Numeros> numberList;

    public SomaNumeros() {
        this.numberList = new ArrayList<>();
    }

    public  void adicionarNumero(int numero){
        numberList.add(new Numeros(numero));
    }

    public int  calcularSoma(){
       int  soma=0;

        if(!numberList.isEmpty()){
            for(Numeros n: numberList){
                soma += n.getNumero();
            }
        }
        return soma;
    }

    public int  encontrarMaiorNumero(){
        int  maior= Integer.MIN_VALUE;
        if(!numberList.isEmpty()){
            for(Numeros n: numberList){
                if(n.getNumero() > maior){
                    maior=n.getNumero();
                }
            }
        }
        return maior;
    }

    public int  encontrarMenorNumero(){
        int  menor= Integer.MAX_VALUE;
        if(!numberList.isEmpty()){
            for(Numeros n: numberList){
                if(n.getNumero() < menor){
                    menor=n.getNumero();
                }
            }
        }
        return menor;
    }

    public List<Numeros> exibirNumeros(){
        return numberList;
    }
}
