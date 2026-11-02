package MultiThreading.ThreadPool;

import java.util.concurrent.*;

public class EXECUTOR {
    public static void main(String[] args) {
        ThreadPoolExecutor exe= new ThreadPoolExecutor(2,5, 10,TimeUnit.MINUTES,
                new ArrayBlockingQueue<Runnable>(2),new CustomThreadFactory(), new CustomReject());
        for(int i=1; i<=10;i++){
            exe.submit(()->{
                try {
                    Thread.sleep(5000);
                }catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Task completed by: " + Thread.currentThread().getName());

            });



        }
        exe.shutdown();
    }
}
class CustomThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        Thread th=new Thread(r);
        th.setPriority(Thread.NORM_PRIORITY);
        th.setDaemon(false);
        return th;
    }
}
class CustomReject implements RejectedExecutionHandler {
    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor e) {
        System.out.println("Task rejected: " + r);
    }

}
