package org.example;


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
        System.out.println("Screen: " + screen + '"');
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}