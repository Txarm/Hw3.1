package ru.test;

public class Main {

    public static void main(String[] args) {
        // Task 1
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Install app for iOS");
        } else {
            System.out.println("Install app for Android");
        }

        // Task 2
        int clientSystemOS = 0;
        int clientDeviceYear = 2016;
        if (clientSystemOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Install iOS app's light version");
        }else if (clientSystemOS != 0 && clientDeviceYear < 2015) {
            System.out.println("Install Android app's light version");
        }else if (clientSystemOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Install standard iOS app");
        }else if (clientSystemOS != 0 && clientDeviceYear >= 2015) {
            System.out.println("Install standard Android app");
        }

        // Task 3

        int year = 2021;
        boolean leapYear = ((year/400 == 0) || (year/4 == 0 && year/100 != 0) );
        if (leapYear) {
            System.out.println("it's Leap year");
        } else System.out.println("it's not leap year");

        // Task 4

        int deliveryDistance = 95;
        if (deliveryDistance > 20) {
            if (deliveryDistance > 60) {
                if (deliveryDistance > 100) {
                    System.out.println("It takes 4 days");
                } else {
                    System.out.println("It takes 3 days");
                }
            }else {
                System.out.println("It takes 2 days");
            }
        }else System.out.println("It takes 1 days");

        // Task 5

        int month = 5;
        switch (month) {
            case 1:
                System.out.println("Winter");
                break;
            case 2:
                System.out.println("Winter");
                break;
            case 3:
                System.out.println("Spring");
                break;
            case 4:
                System.out.println("Spring");
                break;
            case 5:
                System.out.println("Spring");
                break;
            case 6:
                System.out.println("Summer");
                break;
            case 7:
                System.out.println("Summer");
                break;
            case 8:
                System.out.println("Summer");
                break;
            case 9:
                System.out.println("Autumn");
                break;
            case 10:
                System.out.println("Autumn");
                break;
            case 11:
                System.out.println("Autumn");
                break;
            case 12:
                System.out.println("Summer");
                break;
            default:
                System.out.println("Month is unknown");
        }
    }
}
