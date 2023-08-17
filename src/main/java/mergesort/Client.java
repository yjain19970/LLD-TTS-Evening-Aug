package mergesort;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {

    /*

    call thread name is: pool-1-thread-1 Array IS: [10, 2, 8, 11, 4, 3, 9, 1]
call thread name is: pool-1-thread-2 Array IS: [10, 2, 8, 11]
call thread name is: pool-1-thread-3 Array IS: [4, 3, 9, 1]
call thread name is: pool-1-thread-4 Array IS: [10, 2]
call thread name is: pool-1-thread-5 Array IS: [4, 3]
call thread name is: pool-1-thread-6 Array IS: [8, 11]
     */

    public static void main(String[] args) throws Exception {

        System.out.println("Main thread name is: " + Thread.currentThread().getName());
        List<Integer> arrayToSort = List.of(
                10, 2, 8, 11, 4, 3, 9, 1
        );

        ExecutorService es = Executors.newFixedThreadPool(10); // EXECUTOR SERVICE
        Sorter sorter = new Sorter(arrayToSort,es);

        Future<List<Integer>> sortedArrayFutures = es.submit(sorter);

        List<Integer> sortedList = sortedArrayFutures.get(); // get the future


        for (Integer in: sortedList) {
            System.out.println(in);
        }
        es.shutdown(); // shutting down your executor service.
    }
}
