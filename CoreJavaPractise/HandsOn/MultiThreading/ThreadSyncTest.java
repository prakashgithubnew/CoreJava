package CoreJavaPractise.HandsOn.MultiThreading;

/**
 * This program demonstrate the use of join method to execute in sync one after another.
 */
public class ThreadSyncTest {
    public static void main(String args[]) {

        PrintDemo PD = new PrintDemo();

        ThreadDemo T1 = new ThreadDemo( "Thread - 1 ", PD );
        ThreadDemo T2 = new ThreadDemo( "Thread - 2 ", PD );

        T1.start();


        // wait for threads to end
        try {
            T1.join();

        } catch ( Exception e) {
            System.out.println("Interrupted");
        }
        T2.start();

        try {
            T2.join();
        } catch ( Exception e) {
            System.out.println("Interrupted");
        }
    }

    ///static class
    static class ThreadDemo extends Thread {
        private Thread t;
        private String threadName;
        PrintDemo  PD;

        ThreadDemo( String name,  PrintDemo pd) {
            threadName = name;
            PD = pd;
        }

        public void run() {
            PD.printCount();
            System.out.println("Thread " +  threadName + " exiting.");
        }

        /*public void start () {
            System.out.println("Starting " +  threadName );
            if (t == null) {
                t = new Thread (this, threadName);
                t.start ();
            }
        }*/
    }


    static class PrintDemo {
        public void printCount() {
            try {
                for(int i = 5; i > 0; i--) {
                    System.out.println("Counter   ---   "  + i );
                }
            } catch (Exception e) {
                System.out.println("Thread  interrupted.");
            }
        }
    }
}