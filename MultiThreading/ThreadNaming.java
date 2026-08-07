package MultiThreading;
class Thread4 extends Thread{
    public void run(){
        System.out.println("Thread Tasking");
        System.out.println(Thread.currentThread().getName());
        // System.out.println(10/0);
    }
    Thread4(String name){
        super(name);
    }
}
public class ThreadNaming {
    public static void main(String[] args) {
        Thread4 t1 = new Thread4("My Thread");
        t1.start();
        Thread.currentThread().setName("Main");
        System.out.println("New Thread Name : "+Thread.currentThread().getName());
        System.out.println(Thread4.currentThread().isAlive());
    }
}
