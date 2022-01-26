package homework;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Animal {

    private String name;
    private boolean isSleeping;
    private int healthPoints;
    private int quantityOfLegs; //added for example

    // constructors
    public Animal() {
        log.info("Object created");
    }

    public Animal(String name) {
        this.name = name;
        log.info("Object " + this.name + " created");
    }

    public Animal(String name, boolean isSleeping, int healthPoints, int quantityOfLegs) {
        this.name = name;
        this.isSleeping = isSleeping;
        this.healthPoints = healthPoints;
        this.quantityOfLegs = quantityOfLegs;
        log.info("Object " + this.name + " created");
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("set user name > " + name);
    }

    // actions
    public void status() {
        System.out.printf("status >\n" + //warning: Concatenation can be replaced with text block
                "\tAnimal\t\t:\t%s\n" +
                "\tIs sleeping\t:\t%s\t\n" +
                "\tHealth\t\t:\t%s\t\n" +
                "\tLegs\t\t:\t%s\n", name, isSleeping, healthPoints, quantityOfLegs);
    }

    public void feed() {
        System.out.print("feed > ");
        if (isSleeping) {
            System.out.println("Can`t feed " + name + " is sleeping, awake first");
        } else if (healthPoints < 4) {
            healthPoints = 4;
            System.out.println(name + " is well-fed, HP = " + healthPoints);
        } else System.out.println(name + " is not hungry");
    }

    public void sleep() {
        System.out.print("sleep > ");
        if (!isSleeping) {
            isSleeping = true;
            System.out.println(name + " went sleep");
        } else System.out.println(name + " is already sleeping");
    }

    public void awake() {
        System.out.print("awake > ");
        if (isSleeping) {
            isSleeping = false;
            System.out.println(name + " awakened");
        } else System.out.println(name + " is not sleeping");
    }

    public void walk() {
        checkHP("walk");
    }

    public void train() {
        checkHP("train");
    }

    public void play() {
        checkHP("play");
    }

    private void checkHP(String actionPhrase) {
        System.out.print(actionPhrase + " > ");
        if (isSleeping) {
            System.out.println(name + " is sleeping, awake first");
        } else if (healthPoints > 0) {
            healthPoints--;
            System.out.println(name + " " + actionPhrase + "ing success " + healthPoints + " Health points left");
        } else
            System.out.println(name + " can`t go " + actionPhrase + "ing, too tired, please feed " + name);
    }
}
