package homework;

import java.util.Arrays;
import java.util.Scanner;

public class LoopHomeWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        while (counter <= 100) {
            System.out.println("Enter number");
            int x = scanner.nextInt();
            counter = counter + x;
        }
        System.out.println("Done " + counter);

        //2.
        int prime;
        boolean isPrime = true;
        System.out.println("Enter number");
        int num = scanner.nextInt();
        for (int i = 17; i <= num; i++) {
            prime = num % 17;
            if (prime == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        //3.
        int[] intArray = new int[15];
        String[] stringArray = {"First", "Second", "Third", "Fourth","Fifth"};
        char[] charArray = {'Q', 'W', 'E', 'R', 'T'};
        for (int n = 0; n < intArray.length; n = n + 1) {
            intArray[n] = n * 3;
            System.out.print(intArray[n] + " ");
        }
        System.out.println();
        for (char letter : charArray) {
            System.out.println(letter);
        }
        int a = 0;
        while (a < stringArray.length) {
            System.out.println(stringArray[a]);
            a = a + 1;
        }
        int[] intArray2 = {17, 27, 37, 47, 57, 67, 77, 87};
        int s = 0;
        do {
            System.out.println(intArray2[s]);
            s = s + 1;
        } while (intArray2[s] < 80);

        //4.
        int[] evenNumbers = new int [100];
        int q = 4;
        for (int b = 0; b < evenNumbers.length; b++) {
            evenNumbers[b] = q;
            System.out.print(evenNumbers[b] + ", ");
            q = q + 4;
        }

        //5.
        System.out.println("Enter number");
        int g = scanner.nextInt();
        int[] factorial = new int[g];
        for (int t = 1; t < factorial.length; t++) {
            factorial[t] = t + 2;
        }
        System.out.println(Arrays.toString(factorial));
        int sum = 1;
        for (int p = 2; p < factorial.length; p++) {
            sum = sum * factorial[p];
        }
        System.out.println("Factorial of " + g + " equals: " + sum);

        //6.
        int PIN = 2277;
        System.out.println("Enter pin");
        int pin = scanner.nextInt();
        int attempt = 1;

        if (pin == PIN) {
            System.out.println("Pin is accepted, welcome!");
        } else while (pin != PIN) {
            if (attempt == 3) {
                System.out.println("Sorry, but you're blocked!");
                break; }
            System.out.println("Wrong Pin, try again!");
            pin = scanner.nextInt();
            attempt++;
            continue;
        }

    }
}


