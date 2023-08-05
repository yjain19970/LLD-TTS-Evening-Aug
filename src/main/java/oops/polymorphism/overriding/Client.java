package oops.polymorphism.overriding;

public class Client {

    public static void main(String[] args) {

        ChildClass cc = new ChildClass();
        //cc.greet();

        ParentClass parentClass  = new ChildClass();

        ChildClass ccc = new ChildClass();
        ccc.greet2();


        parentClass.greet();

        Login l = new Login();

        l.login(parentClass);
        l.login(ccc);





    }


}
