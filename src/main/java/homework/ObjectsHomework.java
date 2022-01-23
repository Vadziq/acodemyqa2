package homework;
import java.util.Scanner;

public class ObjectsHomework {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        Animal dog = new Animal("Dog",false, 4, 4);
        Animal cat = new Animal("Cat",false, 4, 4);
        Animal cow = new Animal("Cow",false, 4, 4);
        Animal chicken = new Animal("Chicken",false, 4, 2);
        Animal sheep = new Animal("Sheep",false, 4, 4);
        Animal pig = new Animal("Pig",false, 4, 4);

        dog.status();
        dog.goSleep();
        dog.goSleep();
        dog.awake();
        dog.awake();
        dog.goTrain();
        dog.goWalk();
        dog.goPlay();
        dog.goTrain();
        dog.goTrain();
        dog.feed();
        dog.feed();

    }

}
