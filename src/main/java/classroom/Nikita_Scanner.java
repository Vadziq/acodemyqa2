package classroom;

import java.util.Random;
import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);

        Random randomizer = new Random();
        int randomNumber = randomizer.nextInt(10 - 1) + 1;
//        int randomNumber = (int) (Math.random() * (10 - 1)) + 1;
        System.out.println("I generated random number from 1 to 10, please guess it!");
        boolean isGuessed = false;
        int counts = 3;

        do {
            System.out.println("Please write a number: ");
            int answer = terminal.nextInt();
            if (answer == randomNumber) {
                System.out.println("You guessed the number! Number was: " + randomNumber);
                isGuessed = true;
            } else {
                counts--;
                if (counts == 0) {
                    System.out.println("Game is finished, no tries left!");
                    break;
                } else {
                    System.out.printf("Number is not correct! You have %d tries left\n", counts);
                }
            }
        } while (!isGuessed);
    }
}