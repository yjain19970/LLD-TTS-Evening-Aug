package oops.interfaces;

public class Dog implements Animal {
    int height = 10;

    public void bark(){
        System.out.println("DOG IS EATING..");
    }

    @Override
    public void eat() {
        System.out.println("DOG IS EATING..");
    }

    @Override
    public void walk() {
        System.out.println("DOG IS WALKING..");
    }
}
