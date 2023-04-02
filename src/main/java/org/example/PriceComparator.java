package org.example;


import java.util.Comparator;

class PriceComparator implements Comparator<Laptop> {

    @Override
    public int compare(Laptop o1, Laptop o2) {
        return o1.getPrice().compareTo(o2.getPrice());
    }
}



