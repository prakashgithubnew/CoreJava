package CoreJavaPractise.Threading;

public class Deadlockexample {
    public static Object object1 = new Object();
    public static Object object2 = new Object();
    public static void main(String[] args) throws InterruptedException {
        Thread1 thread1 =new Thread1();
        Thread2 thread2 =new Thread2();

        thread1.start();
        //thread1.join();
        thread2.start();
        //thread2.join();
    }

    private static class Thread1 extends Thread {
        public void run() {
            synchronized (object1) {
                System.out.println("Thread 1: Holding lock 1...");

                try { Thread.sleep(10); }
                catch (InterruptedException e) {}
                System.out.println("Thread 1: Waiting for lock 2...");

                synchronized (object2) {
                    System.out.println("Thread 1: Holding lock 1 & 2...");
                }
            }
        }
    }
    private static class Thread2 extends Thread{
        public void run() {
            synchronized (object1) {
                System.out.println("Thread 2: Holding lock 2...");

                try { Thread.sleep(10); }
                catch (InterruptedException e) {}
                System.out.println("Thread 2: Waiting for lock 1...");

                synchronized (object2) {
                    System.out.println("Thread 2: Holding lock 1 & 2...");
                }
            }
        }
    }
}

