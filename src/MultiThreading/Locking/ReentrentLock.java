package MultiThreading.Locking;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrentLock {

    private final ReentrantLock lock = new ReentrantLock();

    private int count = 0;

    public void counter() {

        lock.lock();

        try {

            System.out.println(
                    Thread.currentThread().getName()
                            + " acquired lock in counter()"
            );

            System.out.println("counter() sleeping for 8 seconds...");

            Thread.sleep(8000);

            count++;

            System.out.println("counter() incremented count to: " + count);

        } catch (InterruptedException e) {

            Thread.currentThread().interrupt();

        } finally {

            System.out.println(
                    Thread.currentThread().getName()
                            + " releasing lock from counter()"
            );

            lock.unlock();
        }
    }

    public void counter2() {

        System.out.println(
                Thread.currentThread().getName()
                        + " trying to acquire lock in counter2()"
        );

        lock.lock();

        try {

            System.out.println(
                    Thread.currentThread().getName()
                            + " acquired lock in counter2()"
            );

            count++;

            System.out.println(
                    "counter2() incremented count to: " + count
            );

        } finally {

            System.out.println(
                    Thread.currentThread().getName()
                            + " releasing lock from counter2()"
            );

            lock.unlock();
        }
    }

    public int getCount() {
        return count;
    }
}