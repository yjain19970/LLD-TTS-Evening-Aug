package oops.inheritance.constructorcalls;

public class C extends  B {
    String cName;


    public C(){
        System.out.println("C"); // this one
    }

    public C(String inputName){
        super(1,2,3);
        cName = inputName;
        System.out.println("C constructor with a name: " + cName);
    }

    public C(String inputName, String lastName){
        super(1,2,3);
        cName = inputName;
        System.out.println("C constructor with a name: " + cName + lastName);
    }

    public C(String inputName, Integer lastName){
        super(1,2,3);
        cName = inputName;
        System.out.println("C constructor with a name: " + cName + lastName);
    }
}
