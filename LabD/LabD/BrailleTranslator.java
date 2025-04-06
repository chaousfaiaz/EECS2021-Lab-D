import java.util.*;


/**
 * BrailleTranslator class.  A class to translate ASCII to Braille.
 **/
public class BrailleTranslator {

    /**
     * List containing a Braille Translation
     */
    List<List<String>> translation; 
    /**
     * Map to translate characters to Braille
     */
    Map<Character, List<String>> map;

    /**
     * Create a BrailleTranslator.
     */
    public BrailleTranslator() {
        this.translation = new ArrayList<List<String>>();
        this.map = new HashMap<>();
        initializeMap();
    }

    /**
     * Initialize a map to turn ASCII characters into Braille letters.
     * Read in the file "dictionary.txt" and use it to initialize 
     * the map attribute.  This will be used to translate each ASCII
     * character to a list of strings (e.g. a -> {"10", "00", "00"})
     */
    private void initializeMap() {
         throw new UnsupportedOperationException(); //replace this line!
    }

    /**
     * Translate an entire ASCII line of characters to Braille letters
     * Add the result (a List of Strings) to the translation attribute
     * Each Braille letter is a list of strings (e.g. {"00", "00", "00"})
     * Concatenate translated Braille letters during translation.
     * (e.g. adding {"00", "00", "00"} to {"01", "01", "01"} yields
     * {"0001", "0001", "0001"})
     *
     * @param input the ASCII string to be translated.
     */
    public void translateLine(String input) throws BrailleLetterException {
        throw new UnsupportedOperationException(); //replace this line!
    }

    /**
     * Translate an ASCII character to a single Braille letter.
     * Braille letters are represented as lists of strings.  For example,
     * a white space character will be translated to this Braille letter:
     * 00
     * 00
     * 00
     * The Braille will be represented as a list of strings as follows:
     *      {"00", "00", "00"}
     *
     * @param c: the ASCII character to be translated.
     * @return the Braille character translation (list of strings)
     */
    public List<String> translateChar(char c) {
        throw new UnsupportedOperationException(); //replace this line!
    }

    /**
     * Display a complete Braille Translation
     *
     * @return the string representation of the output stored in the translation attribute
     */
    @Override
    public String toString() {
        String retval = "";
        for (List<String> l: this.translation) {
            retval += l.get(0) + "\n" + l.get(1) + "\n" + l.get(2);
            retval += "\n";

        }
        return retval;
    }

}
