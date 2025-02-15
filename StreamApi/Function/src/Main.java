import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Integer> numeros= Arrays.asList(1,2,3,4,5);

        Function<Integer,Integer>  dobrar = numero -> numero * 2;

        List<Integer> numeroDobrasos = numeros.stream().map(dobrar).toList();

        numeroDobrasos.forEach(s -> System.out.println(s));


    }
}