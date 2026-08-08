package MultiThreading;
public class ThreadYield extends Thread {
    public void run(){
        for(int i=0;i<6;i++){
            System.out.println("Thread Task : "+i);
        }
    }
    public static void main(String[] args) {
        ThreadYield t1 = new ThreadYield();
        t1.start();
        Thread.yield();
        for(int i=0;i<6;i++){
            System.out.println("Main Thread Task : "+i);
        }
    }
}
