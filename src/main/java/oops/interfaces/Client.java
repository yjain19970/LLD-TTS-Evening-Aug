package oops.interfaces;

import oops.inheritance.constructorcalls.D;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        Animal a = new Cat();
        a.eat();
        a.walk();

        Dog d = new Dog();
        d.bark();
        d.eat();
        d.walk();



        Animal b  = new Dog();
        b.walk();
        b.eat();

        /// both of them are of type Animal

        List<Animal>  animalList = new ArrayList<>();
        animalList.add(new Cat());
        animalList.add(new Dog());

    }
}
