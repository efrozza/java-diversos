package arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import static org.junit.jupiter.api.Assertions.assertEquals;


class VetorTest {

    @InjectMocks
    Vetor vetor = new Vetor(3);

    @BeforeEach
    void steup(){

        vetor.adiciona("Teste");
        vetor.adiciona("Everton");
    }

    @Test
    void adiciona() {

        assertEquals(2, vetor.getTamanho());
        assertEquals("Teste", vetor.getElementos()[0]);

    }

    @Test
    void busca() {

        String retorno = vetor.busca(1);
        assertEquals("Everton", retorno);

    }
}