import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<String>palavras = Arrays.asList("dia","noite","estrelado","Via Lactia","cosmos");

        Predicate<String> maisDeCinco= palavra -> palavra.length()>5;

        palavras.stream().filter(maisDeCinco).forEach(p-> System.out.println(p));

    }
}