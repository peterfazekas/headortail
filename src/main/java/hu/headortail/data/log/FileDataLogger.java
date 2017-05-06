package hu.headortail.data.log;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Peter_Fazekas on 2017.05.06..
 */
public class FileDataLogger implements DataLogger {

    private static final String PATH = "src\\main\\resources\\";

    private final String fileName;

    public FileDataLogger(final String fileName) {
        this.fileName = PATH + fileName;
    }

    @Override
    public void print(final String text) {
        try (PrintWriter log = new PrintWriter(new FileWriter(fileName))){
            log.print(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
