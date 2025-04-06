import java.io.IOException;
import java.util.Arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BrailleTranslatorTest {
    @Test
    void initializeMapTest() throws IOException {
        BrailleTranslator translator = new BrailleTranslator();
        assertEquals("", translator.toString(),
                "BrailleTranslator.toString() should be empty before translating.");
    }


    @Test
    void translateCharTest() throws IOException {
        BrailleTranslator translator = new BrailleTranslator();
        assertEquals(Arrays.asList("10", "00", "00"), translator.translateChar('a'),
                "BrailleTranslator.translateChar() failed to provide correct translation.");
    }

    @Test
    void translateLine_invalid() throws IOException {
        BrailleTranslator translator = new BrailleTranslator();
        assertThrows(BrailleLetterException.class, () -> {
            translator.translateLine("/");
        }, "Invalid characters should make BrailleTranslator.translateLine() to raise BrailleLetterException.");
    }

    @Test
    void translateLine_valid() throws BrailleLetterException, IOException {
        BrailleTranslator translator = new BrailleTranslator();
        translator.translateLine("Great.");
        String expected = "111010100100\n111101001111\n001000001001\n";
        assertEquals(expected, translator.toString());
    }

}
