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
     * 1. feladat: Szimuláljon egy pénzfeldobást, ahol azonos esélye van a fejnek és az írásnak is!
     * Az eredményt írassa ki a képernyőre a mintának megfelelően!
     *
     */
    public String simulate() {
        return String.valueOf(RESULTS.charAt(random.nextInt(BOUND)));
    }

    /**
     * 2. feladat: Kérjen be a felhasználótól egy tippet, majd szimuláljon egy pénzfeldobást!
     * Írassa ki képernyőre a felhasználó tippjét és a dobás eredményét is.
     * @param bet - a tipp
     */
    public String bet(final String bet) {
        StringBuilder sb = new StringBuilder();
        String result = simulate();
        sb.append(String.format("   Az Ön tippje: %s, az eredmény: %s. ", bet, result));
        sb.append(check(bet, result) ? "   Ön eltalálta." : "   Ön nem találta el.");
        return sb.toString();
    }

    private boolean check(final String bet, final String result) {
        return bet.length() == LENGTH && bet.toUpperCase().equals(result);
    }

    /**
     * 3. feladat: Állapítsa meg, hány dobásból állt a kísérlet, és a választ a mintának megfelelően
     * írassa ki a képernyőre!
     */
    public String getItemsCount() {
        return data.getData(Source.ITEM_COUNT);
    }

    /**
     * 4. feladat: Milyen relatív gyakorisággal dobtunk a kísérlet során fejet?
     * (A fej relatív gyakorisága a fejet eredményező dobások és az összes dobás hányadosa.)
     * A relatív gyakoriságot a mintának megfelelően két tizedesjegy pontossággal, százalék formátumban
     * írassa ki a képernyőre!
     */
    public String getHeadsRelativeFrequency() {
        return data.getData(Source.HEAD_FREQUENCY);
    }

    /**
     * 5. feladat: Hányszor fordult elő ebben a kísérletben, hogy egymás után pontosan két fejet dobtunk?
     * A választ a mintának megfelelően írassa ki a képernyőre!
     */
    public String getDoubleHeadsCount() {
        return data.getData(Source.DOUBLE_HEAD);
    }

    /**
     * 6. feladat: Milyen hosszú volt a leghosszabb, csak fejekből álló részsorozat? Írassa ki a választ
     * a képernyőre a mintának megfelelően, és adja meg egy ilyen részsorozat első tagjának helyét is!
     */
    public String getLongestHeadSequence() {
        return data.getData(Source.LONGEST_HEAD);
    }

    /**
     * 7. feladat: Állítson elő és tároljon a memóriában 1000 db négy dobásból álló sorozatot!
     * Számolja meg, hogy hány esetben követett egy háromtagú „tisztafej” sorozatot fej, illetve hány
     * esetben írás! Az eredményt írassa ki a dobasok.txt állományba úgy, hogy az első sorba
     * kerüljön az eredmény, a második sorban pedig egy-egy szóközzel elválasztva, egyetlen
     * sorban szerepeljenek a dobássorozatok!
     */
    public String getSequences() {
        return sequence.print();
    }
}
