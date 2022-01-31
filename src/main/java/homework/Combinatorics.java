package homework;
/**
 *
 * @author vvm
 */
public class Combinatorics {


    public static void main(String[] args) {

        int array[] = new int[9];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        array[5] = 6;
        array[6] = 7;
        array[7] = 8;
        array[8] = 9;
        prmt(array, 0);
    }

    private static void prmt(int[] pa, int i) {

        if (i == pa.length - 1) {
            arraout(pa);
        } else {
            for (int j = i; j < pa.length; j++) {
                aswap(pa, i, j);
                prmt(pa, i + 1);
                aswap(pa, i, j);
            }
        }
    }


    static void aswap(int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1]= array[index2];
        array[index2] = tmp;
    }

    private static void arraout(int[] pa) {
//        String s = "[";
//
//        for (int a : pa) {
//            s += a + ", ";
//        }
//
//        s = s.substring(0, s.length() - 2);
//
//        s += "]";
//        System.out.println(s);
//
        int firstSingleDigit = pa[0];
        int firstDoubleDigit = (pa[1]*10)+pa[2];
        int tripleDigit = (pa[3]*100)+(pa[4]*10)+pa[5];
        int secondDoubleDigit = (pa[6]*10)+pa[7];
        int secondSingleDigit = pa[8];

        if(firstSingleDigit * firstDoubleDigit == tripleDigit && tripleDigit == secondDoubleDigit * secondSingleDigit) {

            System.out.println(firstSingleDigit + " * " + firstDoubleDigit + " = " + tripleDigit + " = " + secondDoubleDigit + " * " + secondSingleDigit );
        }

    }
}