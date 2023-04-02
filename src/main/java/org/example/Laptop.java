package org.example;

import java.util.Comparator;
import java.util.Scanner;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

class Laptop extends PersonalComputer{

    private double screen; //диагональ экрана

    public Double getScreen() {return screen;}

    public void print() {
        System.out.print("Laptop. S/N: " + super.getSn() + "; ");
        System.out.print("Brand: " + super.getBrand() + ", ");
        System.out.print("Memory: " + super.getRam() + "Gb; ");
        System.out.print("HDD: " + super.getHDD() + "Gb; ");
        System.out.print("Screen: " + screen + '"' + "; ");
        System.out.print("Price: " + super.getPrice() + "р. \n");
    }

    public void addPC() {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Добавим новый товар. ");
        System.out.println("Введте S/N: ");
        Integer sn = parseInt(iScanner.nextLine());
        super.setSn(sn);
        System.out.println("Введте бренд: ");
        String brand = iScanner.nextLine();
        super.setBrand(brand);
        System.out.println("Введите объём оперативной памяти: ");
        super.setRam(parseDouble(iScanner.nextLine()));
        System.out.println("Введите объем HDD: ");
        super.setHdd(parseInt(iScanner.nextLine()));
        System.out.println("Введите цену: ");
        super.setPrice(parseDouble(iScanner.nextLine()));

        System.out.println("Введите размер экрана: ");
        this.screen = parseDouble(iScanner.nextLine());
    }
}




