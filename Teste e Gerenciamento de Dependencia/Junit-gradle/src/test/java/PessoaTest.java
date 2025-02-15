import org.example.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTest {
    @Test
    void validarCalculoDeIdade(){
        Pessoa pessoa = new Pessoa("julia",LocalDate.of(2023,10,5));
        Assertions.assertEquals(1,pessoa.getidade());
    }
}
