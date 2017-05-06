package hu.headortail.data.read;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * @author Peter_Fazekas on 2017.05.06..
 */
public class ItemCountReader extends DataReader {

    @Override
    public String getResult(final BufferedReader reader) throws IOException{
        return String.format("A kísérlet %d dobásból állt.", itemCounter(reader));
    }

    private int itemCounter(final BufferedReader reader) throws IOException {
        int counter = 0;
        while((reader.readLine())!= null) {
            counter++;
        }
        return counter;
    }

}
