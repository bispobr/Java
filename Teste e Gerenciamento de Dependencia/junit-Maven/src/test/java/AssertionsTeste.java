import org.example.Pessoa;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.time.LocalDate;

public class AssertionsTeste {
    @Test
    public void validarLancamento(){
        int[] lancamento1 = {1,2,3,4,5};
        int[] lancamento2 = {5,4,3,2,1};

        Assertions.assertArrayEquals(lancamento1,lancamento2);
    }

    @Test
    public  void ValidarObjetosEstaNulo(){
        Pessoa clara = null;

        clara= new Pessoa("clara", LocalDate.now());

        Assertions.assertNotNull(clara);
    }

    @Test
    public void ValidaNumerosTiposDiferentes(){
        double valor1 = 5.0;
        double valor2 = 5.0;

        Assertions.assertEquals(valor1,valor2);
    }

}
