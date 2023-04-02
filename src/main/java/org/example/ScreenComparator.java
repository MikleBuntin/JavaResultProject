package org.example;

import java.util.Comparator;

class ScreenComparator implements Comparator<Laptop> {

    @Override
    public int compare(Laptop o1, Laptop o2) {
        return o1.getScreen().compareTo(o2.getScreen());
    }
}
