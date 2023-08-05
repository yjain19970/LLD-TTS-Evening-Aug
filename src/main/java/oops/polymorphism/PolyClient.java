package oops.polymorphism;

public class PolyClient {

    public static void main(String[] args) {

        A a = new C(); // C is the childClass. DataType fort a : A

        a.age =10;
        a.name = "Yash";


        //Q: WHY EVEN WE WANT TO GO WITH THIS WAY>

    }

    public void login(A a){
        if(a.name.equals("Yash")) {

        }
    }
}
