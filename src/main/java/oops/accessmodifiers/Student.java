package oops.accessmodifiers;

public class Student {
    private String name; // NO ONE
    public int age; // ANY ONE
    protected double psp; // SAME DIR OR ANY CHILD CLASS
    String univName; // ONLY SAME DIR

    public Student(){

    }
    public void changeBatch(){
        name = "yash";
        age = 21;
        psp = 10.2;
        univName = "IIT";
    }
}
