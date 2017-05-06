package hu.headortail.service;

import java.util.Scanner;

/**
 * @author Peter_Fazekas on 2017.05.06..
 */
public class Console {

    private final Scanner sc;

    public Console(final Scanner sc) {
        this.sc = sc;
    }

    public String readLine() {
        return sc.next();
    }
}
