package admutex;

import java.sql.Time;
import java.util.concurrent.locks.Lock;

public class Adder implements Runnable {
    private Count count;
    private Lock lock;

    public Adder(Count count, Lock lock) {
        this.count = count;
        this.lock = lock;
    }


    @Override
    public void run() {
        lock.lock();
        System.out.println("Adder Thread took the lock.." + System.currentTimeMillis());
        for (int i = 1; i <= 10000; ++i) {

            count.value += i; // CRITICAL SECTION

        }
        lock.unlock();
        System.out.println("Adder Thread released the lock.." + System.currentTimeMillis());
    }
}
