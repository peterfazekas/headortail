package hu.headortail.data.read;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Peter_Fazekas on 2017.05.06..
 */
public abstract class DataReader {

    private static final String PATH = "src\\main\\resources\\";

    public String read(String source) {
        String result = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(PATH + source))) {
            result = getResult(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    abstract String getResult(final BufferedReader reader) throws IOException;

}
