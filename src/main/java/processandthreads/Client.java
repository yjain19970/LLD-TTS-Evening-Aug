package processandthreads;

public class Client {

    public static void main(String[] args) {

        System.out.println("Hello world from main func" + Thread.currentThread().getName());
        HelloWorldPrinterTask hwpTask = new HelloWorldPrinterTask(); // created object of my task;
        Thread t = new Thread(hwpTask);
        t.start(); // thread would be created.

        System.out.println("Hello world from main func2 " + Thread.currentThread().getName());
        System.out.println("Hello world from main func3 " + Thread.currentThread().getName());
        System.out.println("Hello world from main func4 " + Thread.currentThread().getName());
        System.out.println("Hello world from main func5 " + Thread.currentThread().getName());
        System.out.println("Hello world from main func6" + Thread.currentThread().getName());




    }
}
