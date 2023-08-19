package admutex;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable {
    private Count count;
    private Lock lock;

    public Subtractor(Count count, Lock lock) {
        this.count = count;
        this.lock = lock;
    }

    @Override
    public void run() {
        lock.lock();
        System.out.println("Sub Thread took the lock.." + System.currentTimeMillis());
        for (int i = 1; i <= 10000; ++i) {
            this.count.value -= i; // CRITICAL SECTION
        }
        lock.unlock();
        System.out.println("Sub Thread release the lock.." + System.currentTimeMillis());
    }
}