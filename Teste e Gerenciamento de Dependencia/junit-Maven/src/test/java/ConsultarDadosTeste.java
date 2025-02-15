import org.example.BancoDeDados;
import org.example.Pessoa;
import org.junit.Test;
import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ConsultarDadosTeste {

    @BeforeAll
    static void configuraConexao() {
        BancoDeDados.iniciarConexao();
    }

    @BeforeEach
    void insereDadosParaTeste() {
        BancoDeDados.insereDados(new Pessoa("João", LocalDate.of(2020,1,12)));
    }

    @AfterEach
    void removeDadosDoTeste() {
        BancoDeDados.removeDados(new Pessoa("João", LocalDate.of(2000, 1, 1)));
    }

    @Test
    public void validarDadosDeRetorno() {
        Assertions.assertTrue(true);
    }

    @Test
    public void validarDadosDeRetorno2() {
        Assertions.assertNull(null);
    }

    @AfterAll
    static void finalizarConexao() {
        BancoDeDados.finalizarConexao();
    }
}
