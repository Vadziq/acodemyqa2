package homework;

public class RecursionBase {
    public static void main(String[] args) {
        System.out.println(factorialum(5));
    }

    private static int factorialum(int x) {
        if (x == 1) {
            return 1;
        } else {
            System.out.println(x);
            return x * factorialum(x-1);

        }
    }
}
