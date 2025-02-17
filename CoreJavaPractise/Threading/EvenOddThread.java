package CoreJavaPractise.Threading;

public class EvenOddThread {
    public static void main(String args[]){

        EvenThread evenThread = new EvenThread();
        OddThread oddThread = new OddThread();
        evenThread.start();
        try
        {
            System.out.println("Current Thread: "
                    + Thread.currentThread().getName());
            Thread.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        oddThread.start();
        try
        {
            System.out.println("Current Thread: "
                    + Thread.currentThread().getName());
            Thread.sleep(2);
        }

        catch(Exception ex)
        {
            System.out.println("Exception has " +
                    "been caught" + ex);
        }
    }

    static class OddThread extends Thread {

        public void run() {
            for(int i=1;i<10;i+=2) {
                System.out.println("Printing Odd Number-"+i);
            }
        }
    }


    static class EvenThread extends Thread {

        public void run() {
            for(int i=0;i<10;i+=2) {
                System.out.println("Printing Even Number-"+i);
            }
        }
    }
}
