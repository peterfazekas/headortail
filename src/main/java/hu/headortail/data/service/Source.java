package hu.headortail.data.service;

import hu.headortail.data.read.*;

/**
 * @author Peter_Fazekas on 2017.05.06..
 */
public enum Source {

    ITEM_COUNT(ItemCountReader.class),
    HEAD_FREQUENCY(RelativeFrequencyReader.class),
    DOUBLE_HEAD(DoubleHeadReader.class),
    LONGEST_HEAD(LongestHeadSequenceReader.class);

    private final Class<? extends DataReader> readerClass;

    Source(Class<? extends DataReader> readerClass) {
        this.readerClass = readerClass;
    }

    public static DataReader getInstance(final Source source) {
        DataReader dataReader = null;
        try {
            dataReader = source.readerClass.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return dataReader;
    }
}
