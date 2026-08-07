package MultiThreading;

public class Daemon extends Thread {
    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println("Daemon Thread");
        } else {
            Thread1 t2 = new Thread1();
            t2.start();
            System.out.println(t2.isDaemon());
            System.out.println("Child Thread");
        }
    }

    public static void main(String[] args) {
        // System.out.println("main thread");
        Daemon t1 = new Daemon();
        t1.setDaemon(true);// We have to create Demon Thread before starting the thread.
        System.out.println(t1.isDaemon());
        t1.start();

        // t1.setDaemon(true); Not allowed *Exception - java.lang.IllegalThreadStateException
    }
}
