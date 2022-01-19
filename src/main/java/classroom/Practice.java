package classroom;

public class Practice {
    public static void main(String[] args) {
        int[] a = {1, 7, 6, 8, 10};
        int[] b = {3, 5, 9, 1, 0};
        int[] c = {12, 1, 5, 15, 17};


        for (int numberFromFirstArray : a) {
            for (int numberFromSecondArray : b) {
                for (int numberFromThirdArray : c) {
                    if (numberFromFirstArray == numberFromSecondArray && numberFromFirstArray == numberFromThirdArray) {
                    System.out.println("Number in a:\t" + numberFromFirstArray);
                    System.out.println("Number in b:\t" + numberFromSecondArray);
                    System.out.println("Number in c:\t" + numberFromThirdArray);

                   }
                }
            }
        }
    }
}
