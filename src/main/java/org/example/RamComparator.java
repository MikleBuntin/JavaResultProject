package org.example;

import java.util.Comparator;

class RamComparator implements Comparator<Laptop> {

    @Override
    public int compare(Laptop o1, Laptop o2) {
        return o1.getRam().compareTo(o2.getRam());
    }
}