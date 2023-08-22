package producerconsumersemaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {
    private Queue<Shirt> store;
    private String name;
    private Semaphore semaphoreForProducer;
    private Semaphore semaphoreForConsumer;

    public Consumer(Queue<Shirt> store, String name,
                    Semaphore semaphoreForProducer,
                    Semaphore semaphoreForConsumer) {
        this.store = store;
        this.name = name;
        this.semaphoreForProducer  = semaphoreForProducer;
        this.semaphoreForConsumer = semaphoreForConsumer;
    }

    @Override
    public void run() {
        while (true) {
            try {
                semaphoreForConsumer.acquire(); // decreasing consumer
                store.remove();
                System.out.println(name + " consumed. Left shirts count = " + store.size());
                semaphoreForProducer.release(); // increasing producer
            } catch (InterruptedException e) {
                //e.printStackTrace();
            }

        }
    }
}
