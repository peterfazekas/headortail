package hu.headortail.data.read;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * @author Peter_Fazekas on 2017.05.06..
 */
public class DoubleHeadReader extends DataReader {

    public static final String HEAD = "F";
    public static final int DOUBLE = 2;


    @Override
    public String getResult(final BufferedReader reader) throws IOException {
        return String.format("A kísérlet során %d alkalommal dobtak pontosan két fejet egymás után.", itemCounter(reader));
    }

    private int itemCounter(final BufferedReader reader) throws IOException {
        int counter = 0, headCounter = 0;
        String line;
        while ((line = reader.readLine()) != null) {
            if (line.equals(HEAD)) {
                headCounter++;
            } else {
                if (headCounter == DOUBLE) {
                    counter++;
                }
                headCounter = 0;
            }
        }
        return counter;
    }

}
