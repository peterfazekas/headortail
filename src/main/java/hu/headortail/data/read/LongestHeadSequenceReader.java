package hu.headortail.data.read;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * @author Peter_Fazekas on 2017.05.06..
 */
public class LongestHeadSequenceReader extends DataReader {

    private static final String HEAD = "F";
    private static final String OUTPUT_TEXT = "A leghosszabb tisztafej sorozat %d tagból áll, kezdete a(z) %d. dobás";

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
        return String.format(OUTPUT_TEXT, maxHead, maxPos - maxHead);
    }

}
