package MultiThreading;

public class ThreadSleep extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.println(i+" : "+Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {

        ThreadSleep ts = new ThreadSleep();
        ThreadSleep ts2 = new ThreadSleep();
        ts.start();
        ts2.start();
        System.out.println("hello");
        
    }
}
