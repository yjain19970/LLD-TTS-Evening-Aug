package generics;

public class MyGen<T> {
    T obj;

    // Generic method now. It can take any DATA TYPE as PARAM.
    void add(T obj){
        this.obj = obj;
        System.out.println(" ADDING VALUE + " + obj + 1);
    }

    // T signifies the return type. It is generic.
    T get(){
        return obj;
    }
}
