import java.util.Arrays;
import java.util.List;

public class SomaTodosValores {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int soma = numeros.stream().mapToInt(Integer::intValue).sum();

        System.out.println("Soma de todos os valores:" + soma );
    }
}
