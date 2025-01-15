//letra B)
;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringProgramTest {

    @Test
    public void testCase1_AllValidInputs() {
        String result = StringProgram.processString(5, "abcde", 'c', false);
        assertEquals("Posição: 3", result);
    }

    @Test
    public void testCase2_InvalidLength() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                StringProgram.processString(21, "abcde", 'c', false));
        assertEquals("Erro: Tamanho inválido", exception.getMessage());
    }

    @Test
    public void testCase3_InvalidStringLength() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                StringProgram.processString(5, "abcdef", 'c', true));
        assertEquals("Erro: Tamanho da cadeia não coincide com T", exception.getMessage());
    }

    @Test
    public void testCase4_InvalidCharacter() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                StringProgram.processString(5, "abcde", 'c', false));
        assertEquals("Erro: Mais de um caractere para procurar", exception.getMessage());
    }

    @Test
    public void testCase6_CharNotFound() {
        String result = StringProgram.processString(5, "abcde", 'z', true);
        assertEquals("Caractere não encontrado", result);
    }

    @Test
    public void testCase8_EmptyString() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                StringProgram.processString(5, "", 'c', false));
        assertEquals("Erro: Cadeia de caracteres vazia", exception.getMessage());
    }
}
