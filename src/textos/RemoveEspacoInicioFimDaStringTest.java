package textos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveEspacoInicioFimDaStringTest {

    @Test
    void removeEspacosSemTrim(){

        Assertions.assertEquals("Frase   espaco",
                   RemoveEspacoInicioFimDaString.removerEspacosSemTrim("    Frase   espaco    "));
    }

    @Test
    void removeEspacosComTrim(){

        Assertions.assertEquals("Frase   espaco",
                RemoveEspacoInicioFimDaString.removerEspacosComTrim("    Frase   espaco    "));
    }
}