package org.example;


import java.util.*;

public class Main {
    public static void main(String[] args) {

        HashSet<Laptop> laptopHashSet = new HashSet<Laptop>();

        Scanner iScanner = new Scanner(System.in);
        while (true) {
            System.out.println("Команды:");
            System.out.println("1 - Добавить ноутбук; \n 2 - Просмотреть все \n 3 - отфильтровать по параметру \n 4 - отсортировать  \n Q - выйти");
            String str = iScanner.nextLine();
            if (str.equals("Q")) {
                iScanner.close();
                break;
            } else if (str.equals("1")) {
                Laptop lt1 = new Laptop(); //Создаём пустой экземпляр
                lt1.addLaptop(); //Заполняем созданный экземпляр значениями с помощью метода addLaptop()
                laptopHashSet.add(lt1); // Закидываем текущий экземпляр в HashSet
            } else if (str.equals("2")) PrintAll(laptopHashSet);
            else if (str.equals("3")) PrintFiltered(laptopHashSet);
            else if (str.equals("4")) PrintSorted(laptopHashSet);
        }
    }

    private static void PrintAll(HashSet<Laptop> laptopset) {
        System.out.println("Все ноутбуки:");
        for (Laptop lt : laptopset) lt.printLaptop();
    }

    private static void PrintFiltered(HashSet<Laptop> laptopSet) {
        Scanner iScanner = new Scanner(System.in);
        while (true) {
            System.out.println("Фильтровать по:");
            System.out.println("1 - Цена \n 2 - Объём ОЗУ \n 3 - Объём HDD \n 4 - Диагональ экрана  \n Q - назад");
            String str = iScanner.nextLine();
            if (str.equals("Q")) {
//                iScanner.close();
                break;
            } else if (str.equals("1")) { //Сортировка по Price
                Comparator<Laptop> priceComp = new PriceComparator();
                TreeSet<Laptop> laptopForPrice = new TreeSet(priceComp);
                for (Laptop lt : laptopSet) laptopForPrice.add(lt); // Перекидываем все экземпляры из HashSet в TreeSet
                System.out.println("Фильтр по размеру экрана: \n");
                System.out.println("Наименование; цена");
                for (Laptop lt : laptopForPrice) {
                    System.out.printf("%s ;  %s \n", lt.getBrand(), lt.getPrice());
                }
            } else if (str.equals("2")) { //Сортировка по RAM
                Comparator<Laptop> ramComp = new RamComparator();
                TreeSet<Laptop> laptopForRam = new TreeSet(ramComp);
                for (Laptop lt : laptopSet) laptopForRam.add(lt);
                System.out.println("Фильтр по размеру RAM: \n");
                System.out.println("Наименование; объем ОЗУ");
                for (Laptop lt : laptopForRam) {
                    System.out.printf("%s ;  %s \n", lt.getBrand(), lt.getRam());
                }
            } else if (str.equals("3")) { //Сортировка по HDD
                Comparator<Laptop> hddComp = new HDDComparator();
                TreeSet<Laptop> laptopForHDD = new TreeSet(hddComp);
                for (Laptop lt : laptopSet) laptopForHDD.add(lt);
                System.out.println("Фильтр по размеру HDD: \n");
                System.out.println("Наименование; объём диска");
                for (Laptop lt : laptopForHDD) {
                    System.out.printf("%s ;  %s \n", lt.getBrand(), lt.getHDD());
                }
            } else if (str.equals("4")) { //Сортировка по Screen
                Comparator<Laptop> screenComp = new ScreenComparator();
                TreeSet<Laptop> laptopForScreen = new TreeSet(screenComp);
                for (Laptop lt : laptopSet) laptopForScreen.add(lt);
                System.out.println("Фильтр по размеру экрана: \n");
                System.out.println("Наименование; диагональ");
                for (Laptop lt : laptopForScreen) {
                    System.out.printf("%s ;  %s \n", lt.getBrand(), lt.getScreen());
                }
            } else System.out.println("Неизвестная команда. Повторите ввод. \n");
        }
    }

    private static void PrintSorted(HashSet<Laptop> laptopSet) {
        Scanner iScanner = new Scanner(System.in);
        while (true) {
            System.out.println("Сортировать по:");
            System.out.println(" 1 - Название \n 2 - Объём ОЗУ \n 3 - Объём HDD \n 4 - Диагональ экрана  \n 5 - Цена  \n Q - назад");
            String str = iScanner.nextLine();
            if (str.equals("Q")) {
                break;
            }

            else if (str.equals("1")) { //Сортировка по Brand
                Comparator<Laptop> brandComp = new BrandComparator();
                TreeSet<Laptop> laptopForBrand = new TreeSet(brandComp);
                for (Laptop lt : laptopSet) laptopForBrand.add(lt);
                System.out.println("Сортировка по названию: \n");
                for (Laptop lt : laptopForBrand) lt.printLaptop();
            }
            else if (str.equals("2")) { //Сортировка по ОЗУ
                Comparator<Laptop> ramComp = new RamComparator();
                TreeSet<Laptop> laptopForRam = new TreeSet(ramComp);
                for (Laptop lt : laptopSet) laptopForRam.add(lt);
                System.out.println("Сортировка по RAM: \n");
                for (Laptop lt : laptopForRam) lt.printLaptop();
            }
            else if (str.equals("3")) { //Сортировка по HDD
                Comparator<Laptop> hddComp = new HDDComparator();
                TreeSet<Laptop> laptopForHdd = new TreeSet(hddComp);
                for (Laptop lt : laptopSet) laptopForHdd.add(lt);
                System.out.println("Сортировка по HDD: \n");
                for (Laptop lt : laptopForHdd) lt.printLaptop();
            }
            else if (str.equals("4")) { //Сортировка по Screen
                Comparator<Laptop> screenComp = new ScreenComparator();
                TreeSet<Laptop> laptopForScreen = new TreeSet(screenComp);
                for (Laptop lt : laptopSet) laptopForScreen.add(lt);
                System.out.println("Сортировка по названию: \n");
                for (Laptop lt : laptopForScreen) lt.printLaptop();
            }
            else if (str.equals("5")) { //Сортировка по Price
                Comparator<Laptop> priceComp = new PriceComparator();
                TreeSet<Laptop> laptopForPrice = new TreeSet(priceComp);
                for (Laptop lt : laptopSet) laptopForPrice.add(lt); // Перекидываем все экземпляры из HashSet в TreeSet
                System.out.println("Сортировка по цене: \n");
                for (Laptop lt : laptopForPrice) lt.printLaptop();
            }
            else System.out.println("Неизвестная команда. Повторите ввод. \n");
        }
    }
}