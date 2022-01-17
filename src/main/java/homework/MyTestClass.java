package homework;

import classroom.PrimitiveTypes;

public class MyTestClass {
    public static void main(String[] args) {
//        System.out.println("Test");
//        PrimitiveTypes myObj1 = new PrimitiveTypes();
//        System.out.println(myObj1.);
        Person tom = new Person();
        Person undef = new Person();
        Person bob = new Person("Bob");
        Person mike = new Person("Mike", 25);
        tom.displayInfo();
        tom.name = "Tom";
        tom.age = 20;
        tom.displayInfo();
        undef.displayInfo();
        bob.displayInfo();
        mike.displayInfo();
    }
}

class Person{

    String name;    // имя
    int age;        // возраст
    Person()
    {
        this("Undefined", 18);
    }
    Person(String name)
    {
        this(name, 21);
    }
    Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    void displayInfo(){
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }
}