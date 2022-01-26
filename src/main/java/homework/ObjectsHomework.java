package homework;


public class ObjectsHomework {
    public static void main(String[] args) {

        Animal dog = new Animal("Dog",false, 4, 4);
        Animal cat = new Animal("Cat",false, 4, 4);
        Animal cow = new Animal("Cow",false, 4, 4);
        Animal chicken = new Animal("Chicken",false, 4, 2);
        Animal sheep = new Animal("Sheep",false, 4, 4);
        Animal pig = new Animal("Pig",false, 4, 4);
        Animal unknown = new Animal("Unknown");
        Animal user = new Animal();

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
        dog.sleep();
        dog.feed();
        dog.sleep();
        dog.play();

        unknown.status();

        user.setName("User animal");
        user.status();
    }

}
