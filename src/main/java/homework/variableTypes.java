package homework;

import java.sql.SQLOutput;

public class variableTypes {
    public static void main(String[] args) {


    // 1 Variable examples
        System.out.println("1. Variable examples:");
    //Floats
        System.out.print("Float: ");
        float floatOne = 1234567.8F;
        System.out.println(floatOne);
    //Doubles
        System.out.print("Double: ");
        double doubleOne = 123.987D;
        System.out.println(doubleOne);
    //Bytes
        System.out.print("Byte: ");
        byte byteOne = 123;
        System.out.println(byteOne);
    //Shorts
        System.out.print("Short: ");
        short shortOne = 12345;
        System.out.println(shortOne);
    //Integers
        System.out.print("Integer: ");
        int intOne = 1234567890;
        System.out.println(intOne);
    //Longs
        System.out.print("long: ");
        long longOne = 123456789012345678L;
        System.out.println(longOne);
    //Chars
        System.out.print("Char: ");
        char charOne = '\u0070';
        System.out.println(charOne);

        System.out.println("");

    // 2 Variables MIN/MAX
        System.out.println("2. Variables MIN/MAX:");
        System.out.printf("float\nMIN: %s MAX: %s.\n", Float.MIN_VALUE, Float.MAX_VALUE);
        System.out.printf("double\nMIN: %s MAX: %s.\n", Double.MIN_VALUE, Double.MAX_VALUE);
        System.out.printf("byte\nMIN: %s MAX: %s.\n", Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("short\nMIN: %s MAX: %s.\n", Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("integer\nMIN: %s MAX: %s.\n", Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("long\nMIN: %s MAX: %s.\n", Long.MIN_VALUE, Long.MAX_VALUE);
//        System.out.printf("char\nMIN: %s MAX: %s.\n", Character.MIN_VALUE, Character.MAX_VALUE);
        System.out.println("");

    // 3 Arithmetics
        System.out.println("3. Arithmetics:");
        double a = 30.0D;
        double b = 100.0D;
        System.out.println("");
        double additionResult = a + b;
        System.out.println(a + " + " + b + " = " + additionResult);
        double subtractionResult = a - b;
        System.out.println(a + " - " + b + " = " + subtractionResult);
        double multiplicationResult = a * b;
        System.out.println(a + " * " + b + " = " + multiplicationResult);
        double divisionResult = a / b;
        System.out.println(a + " / " + b + " = " + divisionResult);
        System.out.println("");

    // 4 and 5 Strings
        System.out.println("4. Strings");
        String firstWord = "All";
        String secondWord = "that";
        String thirdWord = "glitters";
        String fourthWord = "is";
        String fifthWord = "not";
        String sixthWord = "gold";

        System.out.println("Using println:");
        System.out.println(firstWord + " " + secondWord + " " + thirdWord + " " + fourthWord + " " + fifthWord + " " + sixthWord + ".");

        System.out.println("Using printf:");
        System.out.printf("%s %s %s %s %s %s.", firstWord, secondWord, thirdWord, fourthWord, fifthWord, sixthWord);

    }
}
