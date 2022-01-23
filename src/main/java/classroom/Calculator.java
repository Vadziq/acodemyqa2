package classroom;

public class Calculator {
    //constructor

    public String name;
    public boolean isScientific;


    public Calculator(String name, boolean isScientific) {
        this.name = name;
        this.isScientific = isScientific;
    }

    public Calculator() {
    }


    //default
    //public
    //private
    //protected

    public int add(int x, int y){
        return x + y;
    }

    public int sub(int x, int y){
        return x - y;
    }

    public int div(int x, int y){
        return x / y;
    }

    public int mul(int x, int y){
        return x * y;
    }

    public void printResult(int number){
        System.out.println(number);
    }

    public void printCalculatorName(){
        System.out.println(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
