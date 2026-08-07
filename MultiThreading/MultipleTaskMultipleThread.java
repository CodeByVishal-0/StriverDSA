package MultiThreading;

class Thread1 extends Thread {
    public void run() {
        System.out.println("Task 1");
    }
}

class Thread2 extends Thread {
    public void run() {
        System.out.println("Task 2");
    }
}

class Thread3 extends Thread {
    public void run() {
        System.out.println("Task 3");
    }
}

public class MultipleTaskMultipleThread {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread3 t3 = new Thread3();
        t1.start();
        t2.start();
        t3.start();
    }
}
