package CoreJavaPractise.HandsOn.MultiThreading;

public class ThreadInterruptExample {

    public static void main(String[] args) throws InterruptedException {

        ThreadEx threadEx = new ThreadEx();
        threadEx.start();
        Thread.sleep(5000);  // Wait for 2 seconds
        threadEx.interrupt();
    }

    static class ThreadEx extends Thread{

        @Override
        public void run(){
            try {
                System.out.println("Thread is going to sleep");
                Thread.sleep(10000);
                System.out.println("Thread woke up");
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted during sleep");

            }
        }
    }
}
