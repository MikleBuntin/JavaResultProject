package org.example;

import java.util.Comparator;
import java.util.Scanner;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

class Laptop implements Comparable<Laptop> {
    Integer sn;
    private String brand;

    private double ram;
    private double hdd;
    private double screen; //диагональ экрана
    Double price;


    public String getBrand() {return brand;}
    public Double getPrice() {return price;}
    public Double getHDD() {return hdd;}
    public Double getRam() {return ram;}
    public Double getScreen() {return screen;}

    @Override
    public int compareTo(Laptop lt) {
        return price.compareTo(lt.getPrice());
    }

    public void printLaptop() {
        System.out.print("Laptop. S/N: " + sn + "; ");
        System.out.print("Brand: " + brand + ", ");
//        System.out.println("CPU: " + cpu + ",  " + cpuspeed + "GHz");
        System.out.print("Memory: " + ram + "Gb; ");
        System.out.print("HDD: " + hdd + "Gb; ");
        System.out.print("Screen: " + screen + '"' + "; ");
        System.out.print("Price: " + price + "р. \n");
    }

    public void addLaptop() {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Добавим новый товар. ");
        System.out.println("Введте S/N: ");
        Integer sn = parseInt(iScanner.nextLine());
        this.sn = sn;
        System.out.println("Введте бренд: ");
        String brand = iScanner.nextLine();
        this.brand = brand;
//        System.out.println("Введите наименование процессора: ");
//        String this.cpu = iScanner.nextLine();
//        System.out.println("Введите частоту процессора: ");
//        String this.cpuspeed = iScanner.nextLine();
        System.out.println("Введите объём оперативной памяти: ");
        this.ram = parseDouble(iScanner.nextLine());
        System.out.println("Введите объем HDD: ");
        this.hdd = parseInt(iScanner.nextLine());
        System.out.println("Введите размер экрана: ");
        this.screen = parseDouble(iScanner.nextLine());
        System.out.println("Введите цену: ");
        this.price = parseDouble(iScanner.nextLine());
    }
}

class BrandComparator implements Comparator<Laptop> {

    @Override
    public int compare(Laptop o1, Laptop o2) {
        return o1.getBrand().compareTo(o2.getBrand());
    }
}
class PriceComparator implements Comparator<Laptop> {

    @Override
    public int compare(Laptop o1, Laptop o2) {
        return o1.getPrice().compareTo(o2.getPrice());
    }
}

class HDDComparator implements Comparator<Laptop> {

    @Override
    public int compare(Laptop o1, Laptop o2) {
        return o1.getHDD().compareTo(o2.getHDD());
    }

}
class RamComparator implements Comparator<Laptop> {

    @Override
    public int compare(Laptop o1, Laptop o2) {
        return o1.getRam().compareTo(o2.getRam());
    }
}

class ScreenComparator implements Comparator<Laptop> {

    @Override
    public int compare(Laptop o1, Laptop o2) {
        return o1.getScreen().compareTo(o2.getScreen());
    }
}



