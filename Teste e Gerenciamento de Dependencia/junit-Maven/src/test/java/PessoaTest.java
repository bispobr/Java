import org.example.Pessoa;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.time.LocalDate;

public class PessoaTest {
    @Test
    public void calcularIdade(){
        Pessoa pessoa =  new Pessoa("bia", LocalDate.of(2023,10,5));
        Assertions.assertEquals(1,pessoa.getIdade());

    }


    @Test
    public void retornoMaiorDeIdade(){
        Pessoa pessoa =  new Pessoa("clara", LocalDate.of(2004,10,5));
        Assert.assertTrue(pessoa.maiorDeIdade());




    }

}
