package CoreJavaPractise.HandsOn.MultiThreading;

public class ThreadInterruptionExample {
    public static void main(String[] args){
        Thread1 thread1 = new Thread1();
        thread1.start();
        thread1.interrupt();
    }

    static class Thread1 extends Thread{

        public void run(){
            System.out.println("Thread started");
            if(Thread.interrupted()){
                System.out.println("Thread Interrrupted");
            }
            System.out.println("Thread started");
            System.out.println("Thread started");
            System.out.println("Thread started");
            System.out.println("Thread started");
            System.out.println("Thread started");
            System.out.println("Thread started");
            System.out.println("Thread started");
            System.out.println("Thread started");
            System.out.println("Thread started");
        }
    }
}
