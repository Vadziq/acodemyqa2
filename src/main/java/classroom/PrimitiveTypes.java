package classroom;

import java.util.Arrays;

public class PrimitiveTypes {

    public static void main(String[] args) {

//        Floating point example

        float floatExample = 999999.8F;
        System.out.println(floatExample);
        System.out.println(999999.99F);

        double doubleExample = 200000.988D;
        System.out.println(doubleExample);
        System.out.println(200000.988D);

//        Integral example

        byte handCount = 2;
        System.out.println(handCount);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);


        short distanceBetweenKievAndRiga = 1011;
        System.out.println(distanceBetweenKievAndRiga);

        int populationOfLatvia = 1900000;
        System.out.println(populationOfLatvia);

        long currentWorldPopulation = 790000000L;
        System.out.println(currentWorldPopulation);

        char ch = '\u0070';
        System.out.println(ch);

        int[] arrayOfPeopleAges = {21, 22, 23, 24};
        System.out.println(Arrays.toString(arrayOfPeopleAges));

//        String variables

        String myName = "Vadim";
        System.out.println(myName);

        String mySurname = "Rizhikov";
        System.out.println(mySurname);

        String myNameAndSurname = myName + " " + mySurname;
        System.out.println(myNameAndSurname);

        // %s
        // \n

        System.out.printf("My name is %s. My surname is %s.\n", myName, mySurname);

        double doubleDivision = 23.4 / 12.4;
        System.out.println(doubleDivision);



    }

}
