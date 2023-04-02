package org.example;

import java.util.Comparator;
import java.util.Scanner;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

class Laptop implements Comparable<Laptop> {


    private Integer sn;
    private String brand;

    private double ram;
    private double hdd;
    private double screen; //диагональ экрана
    private Double price;

    public Integer getSn() {return sn;}
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




