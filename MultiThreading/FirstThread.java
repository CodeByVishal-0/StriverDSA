package MultiThreading;

public class FirstThread extends Thread {
    public void run(){
        System.out.println("Thread Task");
    }
    public static void main(String[] args) {
        FirstThread t1 = new FirstThread();
        t1.start();
        
    }
}
