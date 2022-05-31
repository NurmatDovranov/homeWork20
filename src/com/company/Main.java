package com.company;

import java.util.Scanner;

import static com.company.Days.*;

public class Main {

    public static void main(String[] args) {
        Days [] day = Days.values();

        for(Days i : day)
            System.out.print(i.name()+"<->");
        System.out.println();

        Days day1 = DUISHOMBU;
        Days day2 = SHEISHEMBI;
        Days day3 = SHARSHEMBI;
        Days day4 = BEISHEMBI;
        Days day5 = JUMA;
        Days day6 = ISHEMBI;
        Days day7 = JEKSHEMBI;
        System.out.println("Kundordon bir kundu tandanyz?");
        Scanner scanner = new Scanner(System.in);
        String days = scanner.nextLine();
        try
        {if (days.equalsIgnoreCase("duishombu"))
            System.out.println(day1+" kunu java okuimun.");
        else if (days.equalsIgnoreCase("sheishembi"))
            System.out.println(day2+" kunu english okuimun.");
        else if (days.equalsIgnoreCase("sharshembi"))
            System.out.println( day3+" kunu da java okuimun.");
        else if (days.equalsIgnoreCase("beishembi"))
            System.out.println( day4+" kunu sosft skills okuimun.");
        else if (days.equalsIgnoreCase("juma"))
            System.out.println(day5+" kunu da java okuimun.");
        else if (days.equalsIgnoreCase("ishembi"))
            System.out.println(day6+" kunu ui tapshyrmalardy atkaram.");
        else if (days.equalsIgnoreCase("jekshembi"))
            System.out.println(day7+" kunu es aluu.");
        }
        catch (IllegalArgumentException i) {
            System.out.println(i.getMessage());
        }
    }
}

