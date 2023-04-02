package org.example;

import java.util.Scanner;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class PersonalComputer implements Comparable<PersonalComputer> {

    private Integer sn;
    private String brand;

    private double ram;
    private double hdd;
    private Double price;

    public Integer getSn() {return sn;}
    public String getBrand() {return brand;}
    public Double getPrice() {return price;}
    public Double getHDD() {return hdd;}
    public Double getRam() {return ram;}

    public void setSn(Integer sn) {
        this.sn = sn;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setRam(double ram) {
        this.ram = ram;
    }
    public void setHdd(double hdd) {
        this.hdd = hdd;
    }
    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public int compareTo(PersonalComputer pc) {
            return price.compareTo(pc.getPrice());
    }

    public void print() {
        System.out.print("Laptop. S/N: " + sn + "; ");
        System.out.print("Brand: " + brand + ", ");
        System.out.print("Memory: " + ram + "Gb; ");
        System.out.print("HDD: " + hdd + "Gb; ");
        System.out.print("Price: " + price + "р. \n");
    }

    public void addPC() {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Добавим новый товар. ");
        System.out.println("Введте S/N: ");
        Integer sn = parseInt(iScanner.nextLine());
        this.sn = sn;
        System.out.println("Введте бренд: ");
        String brand = iScanner.nextLine();
        this.brand = brand;
        System.out.println("Введите объём оперативной памяти: ");
        this.ram = parseDouble(iScanner.nextLine());
        System.out.println("Введите объем HDD: ");
        this.hdd = parseInt(iScanner.nextLine());
        System.out.println("Введите цену: ");
        this.price = parseDouble(iScanner.nextLine());
    }
}
