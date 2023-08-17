package printonetohundread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorClient {

    public static void main(String[] args) {
        System.out.println(" name of my thread is: "
                + Thread.currentThread().getName() );
        ExecutorService es = Executors.newCachedThreadPool();
        for(int i=0;i<1000;i++){
            if(i==150){
                System.out.println("TASK IS" + i);
            }
            PrintNumberTask task = new PrintNumberTask(i);
            es.submit(task);
        }
    }
}
