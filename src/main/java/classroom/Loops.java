package classroom;

public class Loops {
    public static void main(String[] args) {

        // Loops (for, while, do ... while)

        /*
        for(initialize counter; conditions; counter change){
        }
         */

        for (int i = 0; i < 5; i++){
            System.out.println("Hello world!");
        }

        for (int i = 5; i > 0; i--){
            System.out.println(i + " test");
        }

        String[] fruits = {"apple", "kiwi", "banana", "strawberry", "lemon"};

        for (int i = 0; i < fruits.length; i++){
            System.out.println(fruits[i]);
        }

        for(String fruit : fruits){
            System.out.println(fruit);
        }

        /*
        7, 14, 21, 28, 35
         */
        int number = 0;

        for (int i = 0; i < 10; i++){
            number += 7;
            System.out.print(number + " ");
        }


        int evenNumbers = 0;

        for (int i = 0; i < 10; i++){
            evenNumbers += 2;
            System.out.println(evenNumbers + " ");

        }

        int[] numbers = {0, 1, 1, 5, 4, 5, 7, 8, 10, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        for (int i = 0; i < numbers.length; i++){
            if(numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }
        }

        System.out.println("\n");
        int[] numbersArray = new int[10];

        for(int i = 0; i < numbersArray.length; i++){
            numbersArray[i] = i + 1;
        }

        for (int numberOfArray : numbersArray){
            System.out.println(numberOfArray);
        }

        // while
        int y = 10;
        while (y > 0){
            System.out.println("Y " + y);
            y--;
        }

        // do while
        int x = 10;
        do {
            System.out.println("X " + x);
            x--;
        } while (x > 0);

        System.out.println();

        int z = 1;
        while (z <= 256){
            System.out.println("Z " + z);
            z *= 2;
        }


    }
}
