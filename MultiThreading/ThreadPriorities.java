package MultiThreading;

public class ThreadPriorities extends Thread {
    public void run(){
        System.out.println("Thread Task");
        System.out.println("Thread Priority : "+Thread.currentThread().getPriority());
    }
    public static void main(String[] args) {
        ThreadPriorities t1 = new ThreadPriorities();
        t1.setPriority(MIN_PRIORITY);
        t1.start();
        System.out.println("Main Priority : "+Thread.currentThread().getPriority());
        
    }
    
}