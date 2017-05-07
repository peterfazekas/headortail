package hu.headortail.data.read;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * @author Peter_Fazekas on 2017.05.06..
 */
public class RelativeFrequencyReader extends DataReader {

    private static final double MULTIPLIER = 100.0;
    private static final String HEAD = "F";
    private static final String OUTPUT_TEXT = "A kísérlet a fej relatív gyakorisága %5.2f%% volt.";

    @Override
    public String getResult(final BufferedReader reader) throws IOException {
        return String.format(OUTPUT_TEXT, itemCounter(reader));
    }

    private double itemCounter(final BufferedReader reader) throws IOException {
        int counter = 0, headCounter = 0;
        String line;
        while ((line = reader.readLine()) != null) {
            counter++;
            if (line.equals(HEAD)) {
                headCounter++;
            }
        }
        return headCounter * MULTIPLIER / counter;
    }

}
