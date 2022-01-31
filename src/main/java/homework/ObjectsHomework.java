package homework;


public class ObjectsHomework {
    public static void main(String[] args) {

        Animal dog = new Animal("Dog");
        Animal cat = new Animal("Cat");
        Animal cow = new Animal("Cow");
        Animal chicken = new Animal("Chicken");
        Animal sheep = new Animal("Sheep");
        Animal pig = new Animal("Pig");

        dog.status();
        dog.sleep();
        dog.sleep();
        dog.awake();
        dog.awake();
        dog.train();
        dog.walk();
        dog.play();
        dog.train();
        dog.train();
        dog.feed();
        dog.feed();
        dog.feed();
        dog.feed();
        dog.feed();
        dog.sleep();
        dog.feed();
        dog.sleep();
        dog.play();

        ObjectsHomework objHome = new ObjectsHomework();
        objHome.test("test");
    }

     void test(String test){
        System.out.println(test);
    }

}
