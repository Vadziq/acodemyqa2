package homework;

import java.util.Scanner;

public class OperatorsAndLoopsHomework {
    public static void main(String[] args) {
        // 1. Check if integer equals 10
        int number = 10;
        if (number == 10) {
            System.out.println("\n1. Integer value is 10");
        }
        System.out.println("\n");
        // 2. Discount depending on age
        int ageOfPerson = 30;
        System.out.println("2. Discount depending on variable ageOfPerson = " + ageOfPerson);
        if (ageOfPerson >= 18 && ageOfPerson <= 21) {
            System.out.println("Students, 10% discount");
        } else if (ageOfPerson >= 22 && ageOfPerson <= 65) {
            System.out.println("Adults, 15% discount");
        } else if (ageOfPerson > 65) {
            System.out.println("Seniors, 20% discount");
        } else {
            System.out.println("No discount until 18 years old");
        }
        System.out.println("\n");


        // 3. Strings Array
        System.out.println("3. Strings Array:");
        String[] arrayOfAnimals =
                {"elephant", "monkey", "parrot", "snake", "tiger", "dog", "shark", "turtle", "whale", "panda"};
        for (String currentAnimal : arrayOfAnimals) {
            System.out.print(currentAnimal + "  ");
        }
        System.out.println("\n");

        // 4. Array with even numbers printout
        System.out.println("4. Array with even numbers printout:");
        int[] arrayOfNumbers = new int[10];
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            arrayOfNumbers[i] = i + 1;
            if (arrayOfNumbers[i] % 2 == 0) {
                System.out.print(arrayOfNumbers[i] + "\t");
            }
        }
        System.out.println("\n");


        // 5. Transport choice
        System.out.println("5. Available transport:");
        Scanner terminal = new Scanner(System.in);
        String[] availableTransport = {"Bus", "Car", "Taxi", "Scooter"};

        for (int i = 0; i < availableTransport.length; i++) {
            System.out.println("\t" + (i + 1) + ": " + availableTransport[i]);
        }
        System.out.print("Choose transport by entering number: ");
        int choice = terminal.nextInt();
        String choicePhrase = "Your choice is: ";

        switch (choice) {
            case 1, 2, 3, 4:
                System.out.println(choicePhrase + availableTransport[choice - 1]);
                break;
            default:
                System.out.println("No such case");
        }
        System.out.println("\n");

        // 6. Increment numbers
        int numberForIncrement = 100;
        System.out.println("6. Increment from " + numberForIncrement + "\n");
        for (int i = 1; i <= numberForIncrement; i++) {
            if (i % 10 == 0) {
                System.out.println();
            }
            System.out.print(i + "\t");
        }
        System.out.println("\n");

        // 7. Decrement numbers
        int numberForDecrement = 50;
        System.out.print("7. Decrement from " + numberForDecrement + "\n");
        for (int i = numberForDecrement; i >= 1; i--) {
            if (i % 10 == 0) {
                System.out.println();
            }
            System.out.print(i + "\t");
        }
        System.out.println("\n");

        // 8. Multiplication table
        int sizeOfTable = 10;
        System.out.println("8. Multiplication table. Size:" + sizeOfTable + "\n");
        for (int a = 1; a <= sizeOfTable; a++) {
            for (int b = 1; b <= sizeOfTable; b++) {
                System.out.print(a * b + "\t");
            }
            System.out.println("\n");
        }
    }
}
