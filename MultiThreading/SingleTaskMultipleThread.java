package MultiThreading;

class SingleTaskMultipleThread extends Thread{
    public void run(){
        System.out.println("Thread Task 2");
    }
    public static void main(String[] args) {
        SingleTaskMultipleThread t1 = new SingleTaskMultipleThread(); //Thread 1
        SingleTaskMultipleThread t2 = new SingleTaskMultipleThread(); //Thread 2
        t1.start();
        t2.start();
    }
}