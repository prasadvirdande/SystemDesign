package MultiThreading.ReadWriteLOck;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main {

    public static void main(String[] args) {
        ReadWriteLock lock=new ReentrantReadWriteLock();
        ReadWrite readWrite = new ReadWrite();

        Thread t1 = new Thread(() -> {
            readWrite.producer();
        });
        Thread t2 = new Thread(() -> {
            readWrite.producer();
        });
        Thread t3 = new Thread(() -> {
            readWrite.consumer();
        });
        t1.start();
        t2.start();
        t3.start();

    }
}
