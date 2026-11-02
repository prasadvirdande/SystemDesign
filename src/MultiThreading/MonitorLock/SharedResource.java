package MultiThreading.MonitorLock;

public class SharedResource {
   boolean isItemavailable=false;

   public synchronized void additem() {
       isItemavailable=true;
       System.out.println("Item added");
       notifyAll();

   }

   public synchronized void consume() {
       System.out.println("Consumer is consuming item");
       while (!isItemavailable) {

           try {
               System.out.println("Consumer is waiting for item");
               wait();
           } catch (InterruptedException e) {
               // TODO: handle exception
           }

       }
       System.out.println("Item consumed");
       isItemavailable=false;


   }
}
