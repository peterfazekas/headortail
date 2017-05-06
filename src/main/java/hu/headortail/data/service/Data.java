package hu.headortail.data.service;

import hu.headortail.data.read.DataReader;

/**
 * @author Peter_Fazekas on 2017.05.06..
 */
public class Data {

    private static final String INPUT = "kiserlet.txt";

    public String getData(final Source source){
        DataReader data = Source.getInstance(source);
        return data.read(INPUT);
    }
}
