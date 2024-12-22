package javaRevision.CollectionFrameWork;

import java.util.Comparator;

public class MyComparetor implements Comparator<Empl> {
    @Override
    public int compare(Empl o1, Empl o2) {
        return o1.getName().toLowerCase().compareTo( o2.getName().toLowerCase());
    }
}
