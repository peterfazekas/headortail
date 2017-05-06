package hu.headortail.service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Peter_Fazekas on 2017.05.06..
 */
public class Sequence {

    private static final int LENGTH = 4;
    private static final int COUNT = 1000;
    private static final String SEPARATOR = ", ";
    private static final String NEW_LINE = "\r\n";


    private final TossUp tossUp;
    private final List<String> sequences;

    public Sequence(final TossUp tossUp) {
        this.tossUp = tossUp;
        sequences = createSequences(COUNT);
    }

    /**
     * 7. feladat
     *
     * @return
     */
    private List<String> createSequences(final int count) {
        List<String> sequences = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            sequences.add(suite());
        }
        return sequences;
    }

    private String suite() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < LENGTH; i++) {
            sb.append(tossUp.simulate());
        }
        return sb.toString();
    }

    public String print() {
        StringBuilder sb = new StringBuilder();
        sb.append(countItems("FFFF"))
                .append(SEPARATOR)
                .append(countItems("FFFI"))
                .append(NEW_LINE)
                .append(printItems());
        return sb.toString();

    }

    private String countItems(final String pattern) {
        long count = sequences.stream().filter(i -> i.equals(pattern)).count();
        return String.format("%s %d", pattern, count);
    }

    private String printItems() {
        StringBuilder sb = new StringBuilder();
        sequences.stream().map(i -> i + " ").forEach(sb::append);
        return sb.toString();
    }


}
