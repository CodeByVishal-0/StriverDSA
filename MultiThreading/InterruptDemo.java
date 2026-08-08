package MultiThreading;

public class InterruptDemo extends Thread {
    public void run(){
        for(int i=0;i<6;i++){
            try{
                System.out.println("Thread Running _ "+i);
                System.out.println(Thread.interrupted()+" : interrupted()");
                Thread.sleep(1000);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        InterruptDemo t = new InterruptDemo();
        t.start();
        t.interrupt();
        System.out.println(t.isInterrupted()+" : isInterrupted()");
    }
}
