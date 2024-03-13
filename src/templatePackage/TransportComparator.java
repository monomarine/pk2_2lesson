package templatePackage;

import java.util.Comparator;

public class TransportComparator implements Comparator<Tranport> {
    @Override
    public int compare(Tranport o1, Tranport o2) {
       return o1.type > o2.type ? 1 : -1;
    }
}

