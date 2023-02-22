package br.com.alura.escola.dominio.aluno;

import br.com.alura.escola.dominio.aluno.Telefone;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelefoneTest {

    @Test
    void deveriaLancarExceptionComDDDInvalido() {
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone(null, "12345678"));
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("", "12345678"));
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("1", "12345678"));
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("123", "12345678"));
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("aa", "12345678"));
    }

    @Test
    void deveriaLancarExceptionComNumeroInvalido() {
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("11", null));
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("11", ""));
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("11", "1234567"));
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("11", "1234567890"));
    }

    @Test
    void deveriaCriarTelegoneCorretamente() {
        assertDoesNotThrow(() -> new Telefone("11", "12345678"));
        assertDoesNotThrow(() -> new Telefone("11", "123456789"));
    }

}
