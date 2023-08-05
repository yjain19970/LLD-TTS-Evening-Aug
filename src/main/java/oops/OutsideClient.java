package oops;

import oops.accessmodifiers.Student;

// this class is child of student class.
public class OutsideClient extends Student {

    public static void main(String[] args) {
        System.out.println("Test");


        OutsideClient oc = new OutsideClient();

        oc.age = 10;
        oc.psp = 10.2;

    }
}
