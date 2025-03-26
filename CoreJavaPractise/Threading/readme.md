
**Multithreading**
------------------

1. If you want any process to be completed first then another process to start then use join method.
   for e.g, if t1,t2 and t3 are the thread which are executing and you want t1 to finish before
   t2 then use below
   t1.start()
   t1.join() - join will ensure t1 gets finished before t2 starts.
   t2.start()
   t2.join() - once t2 finished then t2 will start
   t3.join()

    2. Multithreading can be achieved by 2 ways.Extending the class with Thread and implementing by runnable interface.
       Extending any thread can be preferred as the object can use multiple methods yield and interrupt
       which is not possible in case of runnable.
   3. Suppose you have 2 threads and you started both by using t1.start and t2.start and then you are using
   t1.join and then t2.join.This will not synchronize threads to run one after another because you started both together.
   To make it work one after another you need to use as below
   t1.start()
   t1.join()
   t2.start()
   t2.join()

Now this will make t1 to start and finish first and then same way for t2.

4. if you started both by t1.start and t2.start and t1.join and t2.join then to make it synchronize 
you will need to use either synchronized block or method.


**Life Cycle of MultiThreads**
-------------------------------
![img.png](img.png)

1. New thread
2. Runnable
3. Block
4. Wait
5. Terminate



**Thread scheduler** 
---------------------

1. To schedule thread to run every 2 seconds till 10 seconds
Use ScheduledExecutorService class and call scheduleAtFixedRate method to call Thread class where function 
is written refer program TestThread in this package.
Refer [ScheduledExecutorService.java]() file


**Thread Pool**
---------------
1.  Create pool of threads and use it when needed else put that in pool to future use.
2.  Refer Program [ExecutorServiceExample.java]() for more reference
3. You can use ExecutorService and ThreadPoolExecutor class for the same


**CountDownLatch**
-------------------
1. Using a CountDownLatch we can cause a thread to block until other threads have completed a given task.
2. you need to create an instance of countdownlatch and use methods wait and countdown to decrement the sequence.
3. CountDownLatch is particularly useful in scenarios where you need to wait for a set of operations to 
    complete before proceeding. 

**difference between wait,notify and notify all and sleep**
-----------------------------------------------------------
wait, notify and notifyall are object class method where sleep is thread class method

**Thread Interruption**
-----------------------
Thread can be interrupted by using Thread.interrupt() method.
Once thread is started by start method the same can be interrupted anytime.

**Asynchronous programming**
--------------------------------------------------
Async call can be made in java using Completable Future class or ExecutorService as below
In this an Async call is added to queue and will be returned after its completed

Refer full program in [CompletableFutureProgram.java]()

    CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
    try {
    Thread.sleep(200);
    } catch (InterruptedException e) {
    e.printStackTrace();
    }
    return "Hello, CompletableFuture!";
    });
or ExecutorServiceProgram.java

**ExecutorService**
-------------------

ExecutorService automatically provides a pool of threads and an API for assigning tasks to it.
It executes the tasks asynchronously.
It manages the thread creation and management.

**CompletableFuture**
---------------------
CompletableFuture is a class in java.util.concurrent that represents an asynchronous computation. 
It allows writing non-blocking, parallel, and reactive-style code in Java.


**Problem Statement**
---------------------
    Implement a solution that processes (just log) a large dataset of payments using multithread 
    and grouping them based on payment type.

------------------------program----------------------


      import java.util.*;
      import java.util.concurrent.*;
      import java.util.stream.IntStream;
      
      class Payment {
      private final String paymentType;
      private final double amount;

    public Payment(String paymentType, double amount) {
        this.paymentType = paymentType;
        this.amount = amount;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Payment{" + "type='" + paymentType + "', amount=" + amount + '}';
    }
}

      public class PaymentProcessor {
      private static final int THREAD_COUNT = 4;

    public static void main(String[] args) {
        // Generate a large dataset of payments
        List<Payment> payments = generatePayments(1000);

        // Process payments using multithreading
        processPayments(payments);
    }

    private static List<Payment> generatePayments(int count) {
        String[] paymentTypes = {"Credit Card", "Debit Card", "UPI", "Net Banking"};
        Random random = new Random();
        List<Payment> payments = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            payments.add(new Payment(paymentTypes[random.nextInt(paymentTypes.length)], random.nextDouble() * 1000));
        }
        return payments;
    }

    private static void processPayments(List<Payment> payments) {
        ExecutorService executorService = Executors.newFixedThreadPool(THREAD_COUNT);
        ConcurrentMap<String, List<Payment>> groupedPayments = new ConcurrentHashMap<>();

        for (Payment payment : payments) {
            executorService.submit(() -> {
                groupedPayments.computeIfAbsent(payment.getPaymentType(), k -> Collections.synchronizedList(new ArrayList<>()))
                               .add(payment);
                System.out.println("Processed: " + payment);
            });
        }

        executorService.shutdown();
        try {
            executorService.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // Log grouped payments
        System.out.println("\nPayments grouped by type:");
        groupedPayments.forEach((type, list) -> System.out.println(type + " -> " + list.size() + " transactions"));
    }
}
-------------------------------------------------------------------------------------------------------------------

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

wait, notify and notifyAll exist in Object Class.

**difference between thread start and run method**
--------------------------------------------------
start method is unpredicatable which thread will be given chance to execute but when you call
run method direct its synchronous method.










