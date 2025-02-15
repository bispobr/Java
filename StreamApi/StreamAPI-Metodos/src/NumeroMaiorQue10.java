import java.util.Arrays;
import java.util.List;

public class NumeroMaiorQue10 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean maior10 = numeros.stream().anyMatch(n -> n > 10);

        System.out.println((maior10)?"A lista possui numeros maior qur10":"A lista não possui numeros maior que 10");
    }
}
