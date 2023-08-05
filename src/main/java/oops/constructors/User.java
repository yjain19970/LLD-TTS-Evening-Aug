package oops.constructors;

public class User {
    String name;
    int age;
    char grade;

    public User(){}

    public User(String inputName, int inputAge){
        System.out.println("before:");
        System.out.println(name);
        System.out.println(age);
        System.out.println("after:");
        name = inputName;
        age = inputAge;
    }

    // copy constructor.
    public User(User inputUser){
        name = inputUser.name;
        age = inputUser.age;
    }


}
