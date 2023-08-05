package oops.constructors;

public class Client {

    public static void main(String[] args) {
        User oldUser = new User("Yash", 25);
        User newUser = new User(oldUser);
        newUser.age = 100;

        System.out.println("old " +oldUser);
        System.out.println("new " + newUser);

        User thirdUser = oldUser;
        thirdUser.age = 101;

        System.out.println("third user " + thirdUser.age + " oldUser: " + oldUser.age);


        // 10:40PM IST




    }
}
