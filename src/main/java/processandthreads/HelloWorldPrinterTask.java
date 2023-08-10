package processandthreads;

public class HelloWorldPrinterTask implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello world from new thread..." + Thread.currentThread().getName());
    }
}
