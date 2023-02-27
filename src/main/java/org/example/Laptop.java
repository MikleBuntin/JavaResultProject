package org.example;

import java.util.Scanner;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

class Laptop {
    Integer sn;
    String brand;
    //    private String model;
//    private String cpu;
//    private double cpuspeed;
//    private double mem;
//    private double hdd;
//    private double screen; //диагональ экрана
    Double price;

    void printLP() {
        System.out.printf("sn: %s, %s, %s \n", sn, brand, price);
    }

}

    //    public String getName() { return name; }
//    public int getPrice() { return price; }
//    public String getCompany() { return company; }
//    public Double getPrice() { return price; }
//    public Laptop(Integer sn, String brand, Double price) {
//        this.sn = sn;
//        this.brand = brand;
//        this.price = price;
//    }



//    public void printlLaptop() {
//        System.out.println("Laptop. S/N: " + sn + ";");
////        System.out.println("Brand: " + brand + ", model: " + model);
////        System.out.println("CPU: " + cpu + ",  " + cpuspeed + "GHz");
////        System.out.println("Memory: " + mem + "Gb");
////        System.out.println("HDD: " + hdd + "Gb");
////        System.out.println("Screen: " + screen + '"');
//        System.out.println("Price: " + price + "р.");
//    }

//    public void addLaptop() {
//        Scanner iScanner = new Scanner(System.in);
//        System.out.printf("Добавим новый товар. ");
//        System.out.printf("Введте S/N: ");
//        Integer sn = parseInt(iScanner.nextLine());
//        this.sn = sn;
//        System.out.printf("Введте бренд: ");
//        String brand = iScanner.nextLine();
//        this.brand = brand;
////        System.out.println("Введите наименование процессора: ");
////        String this.cpu = iScanner.nextLine();
////        System.out.println("Введите частоту процессора: ");
////        String this.cpuspeed = iScanner.nextLine();
////        System.out.println("Введите объём оперативной памяти: ");
////        String this.memory = iScanner.nextLine();
////        System.out.println("Введите объем HDD: ");
////        String this.hdd = iScanner.nextLine();
////        System.out.println("Введите размер экрана: ");
////        String this.screen = iScanner.nextLine();
//        System.out.println("Введите цену: ");
//        this.price = parseDouble(iScanner.nextLine());
////        iScanner.close();
//    }
//    public Double GetPrice() {
//        return price;
//    }
//}
