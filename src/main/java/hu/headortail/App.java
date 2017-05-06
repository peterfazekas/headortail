package hu.headortail;

import hu.headortail.data.log.DataLogger;
import hu.headortail.data.log.FileDataLogger;
import hu.headortail.service.Console;
import hu.headortail.service.TossUp;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Peter_Fazekas on 2017.05.06..
 */
public class App {

    private final TossUp tossUp;
    private final Console console;
    private final DataLogger log;

    public static void main(String[] args) {
        App app = new App();
        app.println();
    }

    public App() {
        tossUp = new TossUp(new Random());
        console = new Console(new Scanner(System.in));
        log = new FileDataLogger("dobasok.txt");
    }

    private void println() {
        System.out.println("1. feladat: A pénzfeldobás eredménye: " + tossUp.simulate());
        System.out.print("2. feladat: Tippeljen [F/I]: ");
        System.out.println(tossUp.bet(console.readLine()));
        System.out.println("3. feladat: " + tossUp.getItemsCount());
        System.out.println("4. feladat: " + tossUp.getHeadsRelativeFrequency());
        System.out.println("5. feladat: " + tossUp.getDoubleHeadsCount());
        System.out.println("6. feladat: " + tossUp.getLongestHeadSequence());
        log.print(tossUp.getSequences());
    }

}
