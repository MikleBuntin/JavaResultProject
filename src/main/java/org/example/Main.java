package org.example;


import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
    Laptop lp1 = new Laptop();
    lp1.printLP();
    lp1.sn = 001;
    lp1.brand = "Asus";
    lp1.price = 1200.0;
    lp1.printLP();
    }
}
//        Scanner iScanner = new Scanner(System.in);
//
//        HashSet<Laptop> laptopset = new HashSet<>();
//
//        while(true) {
//            System.out.println("Команды:");
//            System.out.println("1 - Добавить ноутбук; \n 2 - Просмотреть все \n 3 - отфильтровать по параметру \n 4 - отсортировать  \n Q - выйти");
//            String str = iScanner.nextLine();
//            if (str.equals("Q")) {
//                iScanner.close();
//                break;
//            }
//            else if (str.equals("1")) {
//                Laptop lt1 = new Laptop();
//                lt1.addLaptop();
//                laptopset.add(lt1);
//            }
//            else if (str.equals("2")) PrintAll(laptopset);
//            else if (str.equals("3")) PrintFiltered(laptopset);
//
//            else System.out.println("Неизвестная команда. Повторите ввод.");
//        }
//        System.out.println("До свидания!");
//    }
//
//    private static void PrintAll(HashSet<Laptop> laptopset) {
//        System.out.println("Все ноутбуки:");
//        for (Laptop lt:laptopset) lt.printlLaptop();
//    }
//    private static void PrintFiltered(HashSet<Laptop> laptopset) {
//        Scanner iScanner = new Scanner(System.in);
//        while(true) {
//            System.out.println("Фильтровать по:");
//            System.out.println("1 - Цена \n 2 - Объём ОЗУ \n 3 - Объём HDD \n 4 - Диагональ экрана  \n Q - назад");
//            String str = iScanner.nextLine();
//            if (str.equals("Q")) {
////                iScanner.close();
//                break;
//            }
//            else if (str.equals("1")) { //Сортировка по Price
////                Map<Double, String> sortedLTList = new TreeMap<>();
////                for (Laptop lt:laptopset) {
////                    sortedLTList.put(lt.price, lt.brand);
////                    System.out.println("Puted: " + lt.price + lt.brand);
////                }
////                System.out.println("Сортировка по цене:");
////                for (Double key : sortedLTList.keySet()) {
////                    System.out.println(sortedLTList.get(key) + ",  " + key + "р.\n" );
////                }
//                List sortedList = laptopset.stream()
//                        .sorted(Comparator.comparing(Laptop::getPrice))
//                        .collect(Collectors.toList());
//                System.out.println(sortedList);
//
//
//            }
//
////            else if (str.equals("2")) PrintAll(laptopset);
////            else if (str.equals("3")) PrintFiltered(laptopset);
//
//            else System.out.println("Неизвестная команда. Повторите ввод. \n");
//        }
//
////        for (Laptop lt:laptopset) lt.printlLaptop();
//
//    }
//
//}