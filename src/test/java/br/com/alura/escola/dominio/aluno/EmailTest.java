package br.com.alura.escola;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {

    @Test
    void deveriaLancarExceptionComEnderecosInvalidos() {
        assertThrows(IllegalArgumentException.class,
                () -> new Email(null));
        assertThrows(IllegalArgumentException.class,
                () -> new Email(""));
        assertThrows(IllegalArgumentException.class,
                () -> new Email("emailinvalido"));
    }

    @Test
    void deveriaCriarEmailCorretamente() {
        assertDoesNotThrow(() -> new Email("email.123@gmail.com"));
    }

}
