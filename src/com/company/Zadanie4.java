package com.company;

import java.util.Scanner;
import java.lang.InterruptedException;
import java.lang.Math;

public class Zadanie4 {
    static int firstCoffe = 5;
    static int secondCoffe = 8;
    static int thirdCoffe = 8;
    static int fourthCoffe = 10;
    public static void main(String[] args) {


    }


    public static void totalRecall()
    {
        showMenu();
        int userChoice = userChoice();
        userChoice = menuChoice(userChoice);
        choosing(userChoice);
    }

    static void showMenu()
    {
        System.out.println("Witam! Poprosze wybrać z menu kawusie jaką sobie życzysz: ");
        System.out.println("1. Szybciutkie Espresso.");
        System.out.println("2. Delikatniutkie Caffe Latte.");
        System.out.println("3. Palce lizać Latte Macchiato.");
        System.out.println("4. Zimniutka Cafe Frappe.");
        System.out.println("5. Wiecej informacji na temat kawusiek mniam mniam");
    }

    static int userChoice()
    {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }

    static int menuChoice(int userChoice) {
        while (userChoice != 1 || userChoice != 2 || userChoice != 3 || userChoice != 4) {
            if (userChoice == 1) {
                System.out.println("Wybrales kawusie numer 1 czyli SZYBCIUTKIE ESPRESSO, należy się 5 zł halo");
                break;
            } else if (userChoice == 2) {
                System.out.println("Wybrales kawusie numer 2 czyli DELIKATNIUTKIE CAFFE LATTE należy się 8 zł halo");
                break;
            } else if (userChoice == 3) {
                System.out.println("Wybrales kawusie numer 3 czyli PALCE LIZAC LATTE MACCHIATO należy się 8 zł halo");
                break;
            } else if (userChoice == 4) {
                System.out.println("Wybrales kawusie numer 4 czyli ZIMNIUTKA CAFE FRAPPE należy się 10 zł halo");
                break;
            } else if (userChoice == 5) {
                System.out.println("Oto super opis naszych kawusiek am am:");
                System.out.println("Usluga tymczasowo niedostepna, sprobuj jeszcze raz");
                userChoice = userChoice();

            } else {
                System.out.println("HALKO CO JEST, WYBIERZ JESZCZE RAZ, COS PALUSZEK CI SIE OMSKNAL CZY COS TAM");
                userChoice = userChoice();
            }
        }
        return userChoice;

    }

    static void choosing(int userChoice)
    {
        if(userChoice == 1)
            firstCoffe(userChoice);
        else if(userChoice == 2)
            secondCoffe(userChoice);
        else if(userChoice == 3)
            thirdCoffe(userChoice);
        else if(userChoice == 4)
            fourthCoffe(userChoice);
    }

    static void firstCoffe(int userChoice)
    {
        moneyCalculation(firstCoffe);
        try {
            timeCalculation(userChoice);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    static void secondCoffe(int userChoice)
    {
        moneyCalculation(secondCoffe);
        try {
            timeCalculation(userChoice);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    static void thirdCoffe(int userChoice)
    {
        moneyCalculation(thirdCoffe);
        try {
            timeCalculation(userChoice);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    static void fourthCoffe(int userChoice)
    {
        moneyCalculation(fourthCoffe);
        try {
            timeCalculation(userChoice);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }


    static void moneyCalculation(double cost)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile pieniazkow dajesz? Halko");
        double cash = scanner.nextDouble();
        while (cost-cash != 0)
        {
            if(cash>cost)
            {
                System.out.println("ALE FAJNA KASIORKA, ale za dużo jest, trzymaj reszte");
                double temp = 0;
                temp = cash - cost;
                System.out.println("reszta wnosi: " + temp);
                cash = cash-temp;
                break;
            }
            double money;
            money = cost - cash;
            double rounded = Math.round(money*100.0)/100.0;
            System.out.println("Brakuje ci jeszcze: " + rounded + " zloty, dodaj tyle!");
            cash = cash + scanner.nextDouble();
        }
    }


    static void timeCalculation(int userChoice) throws InterruptedException {
        System.out.println("Prosze czekac, kawka sie robi. ODLICZANIE CZAS ZACZĄC!");
        if(userChoice == 1)
        {
            int j = 10;
            System.out.println("Bedziesz czekac "+ j + " sekund");
            for (; j >= 0; j--)
            {
                Thread.sleep(1000);
                System.out.println(j);
            }
        }

        if(userChoice == 2)
        {
            int j = 60;
            System.out.println("Bedziesz czekac "+ j + " sekund");
            for (; j >= 0; j--)
            {
                Thread.sleep(1000);
                System.out.println(j);
            }
        }

        if(userChoice == 3)
        {
            int j = 50;
            System.out.println("Bedziesz czekac "+ j + " sekund");
            for (; j >= 0; j--)
            {
                Thread.sleep(1000);
                System.out.println(j);
            }
        }

        if(userChoice == 4)
        {
            int j = 100;
            System.out.println("Bedziesz czekac "+ j + " sekund");
            for (; j >= 0; j--)
            {
                Thread.sleep(1000);
                System.out.println(j);
            }
        }
        System.out.println("Kawka gotowa! Prosze odebrac i zyczymy smaczniusiej kawuni!");

    }
}
