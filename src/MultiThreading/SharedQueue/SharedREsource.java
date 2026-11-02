package MultiThreading.SharedQueue;

import java.util.LinkedList;
import java.util.Queue;

public class SharedREsource {

    private Queue<Integer> queue;
    private int capacity;

    public SharedREsource(int capacity) {
        this.capacity = capacity;
        this.queue = new LinkedList<>();
    }

    public synchronized void produce(int item) throws InterruptedException {
        if(queue.size()==capacity){
            System.out.println("Queue is full");
           wait();
        }
        queue.add(item);
        System.out.println("Produced: " + item);
        notifyAll();

    }

    public synchronized int consume() throws Exception {

        while(queue.isEmpty()){
            System.out.println("Queue is empty");
            wait();
        }
        int item = queue.poll();
        notifyAll();
        System.out.println("Consumed: " + item);
        return item;


    }
}
