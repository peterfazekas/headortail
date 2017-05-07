package hu.headortail.data.read;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * @author Peter_Fazekas on 2017.05.06..
 */
public class ItemCountReader extends DataReader {

    private static final String OUTPUT_TEXT = "A kísérlet %d dobásból állt.";

    @Override
    public String getResult(final BufferedReader reader) throws IOException {
        return String.format(OUTPUT_TEXT, itemCounter(reader));
    }

    private int itemCounter(final BufferedReader reader) throws IOException {
        int counter = 0;
        while ((reader.readLine()) != null) {
            counter++;
        }
        return counter;
    }

}
