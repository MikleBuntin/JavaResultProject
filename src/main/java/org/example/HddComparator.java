package org.example;

import java.util.Comparator;

public class HddComparator implements Comparator<Laptop> {

    @Override
    public int compare(Laptop o1, Laptop o2) {
        return o1.getHDD().compareTo(o2.getHDD());
    }

}
