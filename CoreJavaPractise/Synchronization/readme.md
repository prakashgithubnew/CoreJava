**Thread Synchronization**
---------------------------
1. Used for synchronization of threads

Refer the program below

    class PrintDemo {
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

    class ThreadDemo extends Thread {
    private Thread t;
    private String threadName;
    PrintDemo  PD;
    
    ThreadDemo( String name,  PrintDemo pd) {
    threadName = name;
    PD = pd;
    }
    
    public void run() {
        synchronized(PD) {
        PD.printCount();
        }
    System.out.println("Thread " +  threadName + " exiting.");
    }
    
    public void start () {
    System.out.println("Starting " +  threadName );
    if (t == null) {
    t = new Thread (this, threadName);
    t.start ();
    }
    }
    }

    public class TestThread {
    
    public static void main(String args[]) {
    PrintDemo PD = new PrintDemo();

      ThreadDemo T1 = new ThreadDemo( "Thread - 1 ", PD );
      ThreadDemo T2 = new ThreadDemo( "Thread - 2 ", PD );

      T1.start();
      T2.start();

      // wait for threads to end
      try {
         T1.join();
         T2.join();
      } catch ( Exception e) {
         System.out.println("Interrupted");
      }
}
}

**Join Method**
---------------
join method tells that unless t1 thread completes dont start.
t1.start()---start t1
t1.join()----dont start unless t1 ends


**Synchronization can be achieved by 2 ways**
-----------------------------------------------
1. synchronized block(above program is using synchronized block)

This type gives you more flexibility to put only the code which need to be synchronized 
rather than synchronizing entire method. It implements lock on class object.

2. synchronized method
synchronizing entire method.

**Thread Intercommunication**
-----------------------------
Thread can communicate themself via wait(), notify() and notifyall() method.
refer [TestThread.java]() file for using wait , notify and notifyall method.

wait, notify and notifyall exist in Object Class.

**difference between thread start and run method**
--------------------------------------------------
start method is unpredicatable whcih thread will be given chnace to execute but when you call
run method direct its synchronous method.





