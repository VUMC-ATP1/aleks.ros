package classroom;

import java.util.Scanner;

public class Guesser {
    public static void main (String[] args) {

        int randomNum = (int) (Math.random() * 10);
        System.out.println("Random number is:" + randomNum);

        Scanner scan = new Scanner(System.in);
        int guess = scan.nextInt();

        while (guess!=randomNum){
            if(guess <= 0 || guess > 10){
                System.out.println("Wrong enter");
                guess = scan.nextInt();
                continue;
            }
            System.out.println("Wrong");
            guess = scan.nextInt();
        }
        System.out.println("You Win!!!");


        }
}
