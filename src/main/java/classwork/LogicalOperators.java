package classwork;

public class LogicalOperators {
    public static void main(String[] args) {

        /*
        If operator
         */

            int a = 10;
            int b = 5;

            if(a > b){
                System.out.println("Yes");
            }

        /*
        if else operator
         */
            boolean isStudent = true;
            int nikitaYearsOld = 27;
            boolean isEmployee = false;

            if(isStudent){
                System.out.println("He is a student");
            } else {
                System.out.println("He is NOT a student");
            }

            if(nikitaYearsOld > 18 && !isEmployee){
                System.out.println("Nikita is Mamkyn Nahlebnik");
            } else {
                System.out.println("Everything is good! Good boy!");
            }

        /*
        if else if operator
         */

        String carBrand = "BMW";

        if(carBrand.equals("AUDI")){
            System.out.println("quattro");
        } else if(carBrand.equals("Mazda")){
            System.out.println("rust");
        } else if(carBrand.equals("BMW")){
            System.out.println("drift");
        } else {
            System.out.println("unknown" + carBrand);
        }

        int x = 10;
        int y = 15;

        System.out.println(x > y ? "yes" : "no");
        System.out.println(isStudent ? "Student": "Not student");

        /*
        switch case operator
         */

        String currentMonth = "January";

        switch(currentMonth){
            case "December":
                System.out.println("Winter " + currentMonth );
                break;
            case "January":
                System.out.println("Winter " + currentMonth);
                break;
            case "June":
                System.out.println("Summer " + currentMonth);
                break;
            default:
                System.out.println("not supported " + currentMonth);
        }

        int dayOfWeek = 4;

        switch(dayOfWeek){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("no such day");
        }

        switch(dayOfWeek){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("work");
                break;
            case 6:
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("no such day");
        }


    }
}
