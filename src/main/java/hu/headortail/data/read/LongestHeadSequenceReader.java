package hu.headortail.data.read;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * @author Peter_Fazekas on 2017.05.06..
 */
public class LongestHeadSequenceReader extends DataReader {

    public static final String HEAD = "F";

    @Override
    public String getResult(final BufferedReader reader) throws IOException {
        return itemCounter(reader);
    }

    private String itemCounter(final BufferedReader reader) throws IOException {
        int pos = 0, headCounter = 0, maxHead = 0, maxPos = 0;
        String line;
        while ((line = reader.readLine()) != null) {
            pos++;
            if (line.equals(HEAD)) {
                headCounter++;
            } else {
                if (headCounter > maxHead) {
                    maxHead = headCounter;
                    maxPos = pos;
                }
                headCounter = 0;
            }
        }
        return String.format("A leghosszabb tisztafej sorozat %d tagból áll, kezdete a(z) %d. dobás", maxHead, maxPos);
    }

}
