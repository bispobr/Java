import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class SomaPares {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaPares = numeros.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();

        System.out.println(somaPares);




    }
}
