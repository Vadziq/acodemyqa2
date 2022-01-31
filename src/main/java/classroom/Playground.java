package classroom;

public class Playground {

    public static void main(String[] args) {
        Calculator casio = new Calculator("Casio V4",true);

        System.out.println(casio.div(10, 2));
        //casio.printResult(casio.add(3,3));
        System.out.println(casio.name);

//        Calculator citizen = new Calculator();
//        System.out.println(citizen.name);
//        System.out.println(citizen.getName());
////        citizen.setName("MSI");
//        System.out.println(citizen.getName());
//        System.out.println(citizen.pow(2));
    }
}
