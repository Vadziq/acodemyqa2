package homework;

public class RecursionTest {
    public static void main(String[] args) {
        prmt(0);
    }

    private static void prmt(int i) {
        for (int j = i; j <= 2; j++) {
            System.out.println("i " + i + " j " + j);
            prmt(i + 1);
        }
    }
}
