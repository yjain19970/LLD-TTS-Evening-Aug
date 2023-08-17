package printonetohundread;

public class Client {

    public static void main(String[] args) {
        System.out.println(" name of my thread is: "
                + Thread.currentThread().getName() );
        // I have to print 1-1000 numbers.
        for(int i=0;i<1000;i++){
            PrintNumberTask task = new PrintNumberTask(i);
            Thread t = new Thread(task);
            t.start();
        }
    }
}
