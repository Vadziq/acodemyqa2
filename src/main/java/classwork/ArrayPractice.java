package classwork;

import java.util.List;

public class ArrayPractice {
    public static void main(String[] args) {

        String fruit = "apple";
        String[] fruits = {"apple", "banana", "orange", "strawberry", "melon"};
        System.out.println(fruits[0]);

        if(fruits[1].equals("banana")){
            System.out.println("banana found");
        } else {
            System.out.println("banana not found");
        }

        String[] fruitArray = new String[10];
        fruitArray[0] = "Watermelon";
        System.out.println(fruitArray[0]);
    }
}
