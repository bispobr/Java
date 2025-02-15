import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.BinaryOperator;

public class MediaValoresMaiorQue5 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        BinaryOperator<Integer> soma = Integer::sum;

        OptionalDouble media = numeros.stream().filter(n -> n> 5).mapToInt(Integer::intValue).average();

        if (media.isPresent()) {
            System.out.println("Média dos números maiores que 5: " + media.getAsDouble());
        } else {
            System.out.println("Nenhum número maior que 5.");
        }
    }
}
