import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    /**
     * Main method of the program.
     * The main method will read in the content of the file "hello.txt".
     * It will then translate that text into braille.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        String filename = "hello.txt";
        String line = "";
        BrailleTranslator bt = new BrailleTranslator();

        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            while ((line = br.readLine()) != null)   //returns a Boolean value
            {
                bt.translateLine(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (BrailleLetterException e) {
            System.out.println(e.getMessage());
        }

        //OUTPUT WHEN TRANSLATING HELLO.TXT SHOULD BE:
        //1101101001001101111001
        //0000101010000110101000
        System.out.println(bt);


    }

}
