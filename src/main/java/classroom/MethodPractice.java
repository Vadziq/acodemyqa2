package classroom;

public class MethodPractice {
    public static void main(String[] args) {
    Calculator calc = new Calculator();
        int a = 10;
        int b = 23;
        System.out.println(sum(a, b));

    }

    //public static int sum(int firstNumber, int SecondNumber)
    public static int sum(int firstNumber, int secondNumber){
        int sum = firstNumber + secondNumber;
        return sum;
        //return firstNumber + secondNumber;
    }



}
