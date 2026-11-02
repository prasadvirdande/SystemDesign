package MultiThreading.ReadWriteLOck;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWrite {

    private final ReadWriteLock lock = new ReentrantReadWriteLock();

    public void producer() {
        lock.readLock().lock();

        try {
            System.out.println(
                    "Reading started: " +
                            Thread.currentThread().getName()
            );

            Thread.sleep(5000);

            System.out.println(
                    "Reading finished: " +
                            Thread.currentThread().getName()
            );

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            lock.readLock().unlock();
        }
    }

    public void consumer() {
        try {
            lock.writeLock().lock();

            System.out.println(
                    "Thread tries to write: " +
                            Thread.currentThread().getName()
            );
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(
                    "Wrting finished: "+
                            Thread.currentThread().getName()
            );

        } finally {
            lock.writeLock().unlock();
        }
    }
}