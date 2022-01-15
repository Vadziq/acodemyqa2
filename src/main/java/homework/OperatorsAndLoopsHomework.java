package homework;

public class OperatorsAndLoopsHomework {
    public static void main(String[] args) {
        // 5. Transport choice


        // 6. Increment numbers
        int numberForIncrement = 100;
        System.out.println("Increment from " + numberForIncrement + "\n");
        for(int i = 1; i <=numberForIncrement; i++){
            if(i%10 == 0){
                System.out.println();
            }
            System.out.print(i + "\t");
        }
        System.out.println("\n");

        // 7. Decrement numbers
        int numberForDecrement = 50;
        System.out.print("Decrement from " + numberForDecrement +"\n");
        for(int i = numberForDecrement; i >= 1; i--){
            if(i%10 == 0){
                System.out.println();
            }
            System.out.print(i + "\t");
        }
        System.out.println("\n");

        // 8. Multiplication table
        int sizeOfTable = 30;
        System.out.println("Multiplication table. Size:" + sizeOfTable + "\n");
        for(int a = 1; a <= sizeOfTable; a++){
            for(int b = 1; b <= sizeOfTable; b++){
                System.out.print(a * b + "\t");
            }
            System.out.println("\n");
        }
    }
}
