package classroom;


import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ScannerExample {

    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);
        //Alt+Enter to import
        System.out.println("What is your name?");
        String name;
        name = terminal.nextLine();
        System.out.println("Name is: " + name);



            Random randomizer = new Random();
            int answer;
            int randomNumber = randomizer.nextInt(ThreadLocalRandom.current().nextInt(1, 10));
            System.out.println("I generated random number from 1 to 10, please guess it!");
            do {
                answer = terminal.nextInt();
                if (answer == randomNumber) {
                    System.out.println("You guessed the number! Number was: " + randomNumber);
                } else {
                    System.out.println("You did not guess!: ");
                }
            }while (answer != randomNumber);
        System.out.println("Well done!");


    }
}
