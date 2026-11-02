package MultiThreading.Locking;

public class Main {

    public static void main(String[] args) {

        ReentrentLock counter = new ReentrentLock();

        Thread thread1 = new Thread(
                counter::counter,
                "Thread-1"
        );

        Thread thread2 = new Thread(
                counter::counter2,
                "Thread-2"
        );

        thread1.start();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println(
                "Final count = " + counter.getCount()
        );
    }
}