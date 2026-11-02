package MultiThreading;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MultiTHreading1 thread1 = new MultiTHreading1();
        Multi2 thread2 = new Multi2();

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);


        t2.start();
        t1.sleep(1000);
        t1.start();
    }

}
