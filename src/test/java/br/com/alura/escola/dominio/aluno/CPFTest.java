package br.com.alura.escola.dominio.aluno;

import br.com.alura.escola.dominio.aluno.CPF;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CPFTest {

    @Test
    void deveriaLancarExceptionComCpfInvalido() {
        assertThrows(IllegalArgumentException.class,
                () -> new CPF(null));
        assertThrows(IllegalArgumentException.class,
                () -> new CPF(""));
        assertThrows(IllegalArgumentException.class,
                () -> new CPF("11122233344455"));
    }

    @Test
    void deveriaCriarCpfCorretamente() {
        assertDoesNotThrow(() -> new CPF("111.222.333-44"));
    }

}
