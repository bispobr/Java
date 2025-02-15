import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Integer>numeros = Arrays.asList(1,2,3,4);

        BinaryOperator<Integer> soma = (n1,n2) -> n1+n2;

        int resultado = numeros.stream().reduce(0,soma);

        System.out.println("Resultao da soma: " + resultado);
    }
}