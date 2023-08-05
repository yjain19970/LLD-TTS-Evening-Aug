package oops.inheritance;

import oops.inheritance.constructorcalls.D;
import oops.polymorphism.C;
import oops.polymorphism.overloading.Calculator;

public class Client {

    public static void main(String[] args) {

        Student s = new Student();
        s.name = " Yash";
        s.age = 27;
        s.psp ="10";
        //s.login();
        //System.out.println(s.age + " " + s.name + s.psp);

        User u  = new User();

        // below:
        D d = new D("Yash");


        Calculator c = new Calculator();

        c.sum(1,2);


    }
}
