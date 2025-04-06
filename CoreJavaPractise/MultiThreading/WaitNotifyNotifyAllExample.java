package CoreJavaPractise.MultiThreading;

public class WaitNotifyNotifyAllExample {

    public static void main(String[] args){

        MyThread1 thread1 = new MyThread1();
        MyThread2 thread2 = new MyThread2();

        thread2.start();
        thread1.start();

    }

    private static class MyThread1 extends Thread{


        public void run(){
            synchronized (this){
                System.out.println("Before notify MyThread1");
                notify();
                System.out.println("After notify MyThread1");
            }
        }
    }

    private static class MyThread2 extends Thread{

        public void run(){
            synchronized (this){
                try {
                    System.out.println("Before wait MyThread2");
                    wait();
                    System.out.println("After wait MyThread2");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

}
