package MultiThreading;

public class SingleTaskSingleThread extends Thread {
    public void run(){
        System.out.println("Thread task");
    }
    public static void main(String[] args) {
        SingleTaskSingleThread t1 = new SingleTaskSingleThread();
        t1.start();
    }
}
