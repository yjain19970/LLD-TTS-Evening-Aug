package oops.inheritance.constructorcalls;

public class B extends A {
    public B(){
        System.out.println("B");
    }

    public B(Integer x, Integer y , Integer z){
        System.out.println("B" +x +y+z);
    }
}
