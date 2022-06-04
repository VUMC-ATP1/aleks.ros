package homeworkTwo;

import java.util.Scanner;

import static java.lang.Integer.sum;

public class HomeWorkTwo {
    public static void main(String[] args) {
        int x = 17;
        System.out.println(x > 0);
        System.out.println(x < 0);
        System.out.println(x > 7 && x <= 10);
        System.out.println(!(x <= 7 && x < 10));
        System.out.println(x == 0 || x == 10);
        System.out.println(x * x > 10);
        //
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a month number");
        int Monthnumber = scanner.nextInt();
        switch (Monthnumber) {
            case 1:
                System.out.printf("January");
                break;
            case 2:
                System.out.printf("February");
                break;
            case 3:
                System.out.printf("March");
                break;
            case 4:
                System.out.printf("April");
                break;
            case 5:
                System.out.printf("May");
                break;
            case 6:
                System.out.printf("June");
                break;
            case 7:
                System.out.printf("July");
                break;
            case 8:
                System.out.printf("August");
                break;
            case 9:
                System.out.printf("September");
                break;
            case 10:
                System.out.printf("October");
                break;
            case 11:
                System.out.printf("November");
                break;
            case 12:
                System.out.printf("December");
                break;
            default: System.out.printf("Incorrect data. Number of month can be from 1 to 12");
        }
        System.out.println();
        //
        System.out.println("Enter first number ");
        int number1 = scanner.nextInt();
        System.out.println("Enter second number ");
        int number2 = scanner.nextInt();
        System.out.println("Enter third number ");
        int number3 = scanner.nextInt();
        System.out.println("Max number is :" + Math.max(Math.max(number1,number2),number3));
        //
        Scanner scannerColor = new Scanner(System.in);
        System.out.println("Enter color of traffic lights :");
        String color = scannerColor.nextLine();

        if (color.equals("Green")) {
            System.out.println("Walk!");
        } else if (color.equals("Yellow")) {
            System.out.println("Attention!");
        } else if (color.equals("Red")) {
            System.out.println("Stop, Wait!");
        } else {
            System.out.println("Traffic light not work properly");
        }
        System.out.println();
        //
        System.out.println();
        printBusinessCard();
        printBusinessCard();
        printBusinessCard();
    }
    //

    //

    public static void printBusinessCard() {
        System.out.println("Business Card");
        System.out.println("############");
        System.out.println("Vārds: Janis");
        System.out.println("Uzvārds: Berzins");
        System.out.println("Telefona numurs: +371 7654321");
        System.out.println("Dzimšanas gads: 1990");
        System.out.println("############");
    }

    //
    public static void printBusinessCardTwo(String name, String surname, String phoneNumber, int yearOfBirth) {
        System.out.println("Business card");
        System.out.println("###########");
        System.out.printf("Name: %s\n", name);
        System.out.printf("Surname: %s\n", surname);
        System.out.printf("Phone number: %s\n", phoneNumber);
        System.out.printf("Year of birth: %d\n", yearOfBirth);
        System.out.println("#############");
    }
    //
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    //

    public static double average(double num3, double num4, double num5) {
        return (num3 + num4 + num5) / 3;
    }

}

