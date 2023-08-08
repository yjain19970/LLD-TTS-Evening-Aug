package oops.interfaces;

public class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("Class Cat is EATING....");
    }

    @Override
    public void walk() {
        System.out.println("Class Cat is WALKING....");
    }

    public void meow(){
        System.out.println("DOG IS EATING..");
    }
}
