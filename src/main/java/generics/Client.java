package generics;

public class Client {
    public static void main(String[] args) {

        MyGen<Integer> x = new MyGen<>();
        x.add(1);

        MyGen<String> y  = new MyGen<>();
        y.add("s");

        MyGen<Animals>  a = new MyGen<>();
        a.add(new Animals(1));
    }
}
