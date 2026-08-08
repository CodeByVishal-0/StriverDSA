package MultiThreading;

public class JoinThread extends Thread {
    public void run(){
        for(int i=0;i<5;i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Child Thread : "+i);
        }
    }
    public static void main(String[] args) {
        JoinThread t1 = new JoinThread();
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for(int i=0;i<5;i++){
            System.out.println("Main Thread : "+i);
        }
    }
}

//  For Execution of Main thread before Child Thread
// package MultiThreading;

// public class JoinThread extends Thread {
//     static Thread maint;
//     public static void getThread(Thread t1){
//         maint=t1;
//     }
//     public void run(){
//         for(int i=0;i<5;i++){
//             try {
//                 maint.join();
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//             try {
//                 Thread.sleep(500);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }

//             System.out.println("Child Thread : "+i);
//         }
//     }
//     public static void main(String[] args) {
//         getThread(Thread.currentThread());
//         JoinThread t1 = new JoinThread();
//         t1.start();
//         for(int i=0;i<5;i++){
//             System.out.println("Main Thread : "+i);
//         }
//         System.out.println();
//     }
// }
