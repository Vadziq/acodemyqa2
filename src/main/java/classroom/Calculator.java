package classroom;
import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor
public class Calculator {
    //constructor
    @Getter
    public String name;
    @Getter
    public boolean isScientific;

//    public Calculator(String name, boolean isScientific) {
//        this.name = name;
//        this.isScientific = isScientific;
//    }

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

    public int pow(int x){ return x * x;}



//    public String getName() {
//        return name;
//    }

//   public boolean isScientific() {return isScientific;}

//    public void setName(String name) {
//        this.name = name;
//    }
}
