package hu.headortail.service;

import hu.headortail.data.service.Data;
import hu.headortail.data.service.Source;

import java.util.Random;

/**
 * @author Peter_Fazekas on 2017.05.06..
 */
public class TossUp {

    private static final String RESULTS = "FI";
    private static final int BOUND = 2;
    private static final int LENGTH = 1;
    private final Random random;
    private final Sequence sequence;
    private final Data data;

    public TossUp(final Random random) {
        this.random = random;
        sequence = new Sequence(this);
        data = new Data();
    }

    /**
     * 1. feladat
     */
    public String simulate() {
        return String.valueOf(RESULTS.charAt(random.nextInt(BOUND)));
    }


    /**
     * 2. feladat
     * @param bet
     */
    public String bet(final String bet) {
        return check(bet) ? "Ön eltalálta." : "Ön nem találta el.";
    }

    private boolean check(final String bet) {
        return bet.length() == LENGTH && bet.toUpperCase().equals(simulate());
    }

    /**
     * 3. feladat
     */
    public String getItemsCount() {
        return data.getData(Source.ITEM_COUNT);
    }

    /**
     * 4. feladat
     */
    public String getHeadsRelativeFrequency() {
        return data.getData(Source.HEAD_FREQUENCY);
    }

    /**
     * 5. feladat
     */
    public String getDoubleHeadsCount() {
        return data.getData(Source.DOUBLE_HEAD);
    }

    /**
     * 6. feladat
     */
    public String getLongestHeadSequence() {
        return data.getData(Source.LONGEST_HEAD);
    }

    /**
     * 7. feladat
     */
    public String getSequences() {
        return sequence.print();
    }
}
