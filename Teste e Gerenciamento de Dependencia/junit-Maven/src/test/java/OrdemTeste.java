import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;
public class OrdemTeste {


    @Nested
    @TestMethodOrder(MethodOrderer.DisplayName.class)
    class EscolhendoAOrdemTeste {

        @DisplayName("Teste que valida se o usuário foi criado")
        @Test
        void validaFluxoA() {
            Assertions.assertTrue(true);
        }

        @DisplayName("B")
        @Test
        void validaFluxoB() {
            Assertions.assertTrue(true);
        }

        @DisplayName("C")
        @Test
        void validaFluxoC() {
            Assertions.assertTrue(true);
        }

        @DisplayName("D")
        @Test
        void validaFluxoD() {
            Assertions.assertTrue(true);
         }

    }
}
