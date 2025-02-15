import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        Supplier<String> saudacao = () ->"olá, Supplier";

        List<String> saudacoaLista = Stream.generate(saudacao).limit(5).toList();

        saudacoaLista.forEach(s -> System.out.println(s));


    }
}