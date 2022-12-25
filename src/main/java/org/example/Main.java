package org.example;


import java.util.Scanner;

class laptop {
    public double mem;
    public double hdd;
    public double screen; //диагональ экрана
    public String brand;
    public String model;
    public String cpu;
    public double cpuspeed;
    public void printlLaptop() {
        System.out.println("Brand: " + brand + ", model: " + model);
        System.out.println("CPU: " + cpu + cpuspeed + "GHz");
        System.out.println("Memory: " + mem + "Gb");
        System.out.println("HDD: " + hdd + "Gb");
        System.out.println("Screen: " + screen + '"');
    }

    public void addLaptop() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Добавим новый товар. ");
        System.out.printf("Введте бренд: ");
        String brand = iScanner.nextLine();
        System.out.println("Введите наименование процессора: ");
        String cpu = iScanner.nextLine();
        System.out.println("Введите частоту процессора: ");
        String cpuspeed = iScanner.nextLine();
        System.out.println("Введите объём оперативной памяти: ");
        String memory = iScanner.nextLine();
        System.out.println("Введите объем HDD: ");
        String hdd = iScanner.nextLine();
        System.out.println("Введите размер экрана: ");
        String screen = iScanner.nextLine();
        iScanner.close();

    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}